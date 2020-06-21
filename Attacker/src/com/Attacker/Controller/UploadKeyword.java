package com.Attacker.Controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

import com.Attacker.Bean.FileUploadBean;
import com.Attacker.Bean.UserBean;

import java.sql.Timestamp;
import java.util.Calendar;





@WebServlet("/UploadKeyword")
@MultipartConfig(maxFileSize = 16177215) 
public class UploadKeyword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static  int hour=0;
       
	private String dbURL = "jdbc:mysql://localhost:3306/attacker";
    private String dbUser = "root";
    private String dbPass = "root";
   
    public UploadKeyword() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	int id=Integer.parseInt(request.getParameter("id"));


    	try
    	{
    		System.out.println("id"+id);
    		FileUploadBean bean=new  FileUploadBean();
    		bean.setId1(id);
    		int a = bean.deleteRecord();
    		System.out.println("result"+a);
    	     
    		if(a>0)
    		{
    			 
    			 JOptionPane.showMessageDialog(null,"Record deleted successfully");
    			response.sendRedirect("viewdataownerfileupload.jsp");
    			
    		}
    	}
    	catch(Exception e)
    	{

    		JOptionPane.showMessageDialog(null,"error");
    	}

    		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String btn=request.getParameter("submit");
		PrintWriter out;
		out=response.getWriter();
		
		if(btn.equals("Save"))
		{
		
		HttpSession session=request.getSession(true);
		RequestDispatcher rd= null;
		
		 Date date=new Date();
         DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String DT=dateFormat.format(date);
         System.out.println(DT);
         session.setAttribute("name1",""+DT);
         
         long starttime=System.currentTimeMillis();
         
         
		
		String id = request.getParameter("id");
		String filename = request.getParameter("filename");
	     String filetype = request.getParameter("filetype");
	     String DT1=(String) session.getAttribute("name1");
	     String filekeyword=request.getParameter("filekeyword");
    
	        InputStream inputStream = null; // input stream of the upload file
	        System.out.println("DT:"+DT1);
	        
	     // obtains the upload file part in this multipart request
	       Part filePart = request.getPart("file");
	        
	        SecretKey secKey,secKeyword;
	        
	        
	        
	        if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	            
	            
	            System.out.println("filepart:"+inputStream);
	            
	            InputStreamReader   hi= new InputStreamReader(inputStream);
				 
	            BufferedReader br=new BufferedReader(hi);
	            
	            StringBuilder sb = new StringBuilder();
	            String line;
	    		while ((line = br.readLine()) != null) {
	    			sb.append(line);
	      
	    		}
	    		System.out.println(sb.toString());
	            
	    		try {
					secKey = getSecretEncryptionKey();
					
					
					
	            byte[] cipherText = encryptText(sb.toString(), secKey);
	            
	           
	            System.out.println("Data Of file:"+sb.toString());
	            
	            
	            System.out.println("AES Key (Hex Form):"+bytesToHex(secKey.getEncoded()));
	            
	            System.out.println("Encrypted Text (Hex Form):"+bytesToHex(cipherText));
	           
	            String decryptedText = decryptText(cipherText, secKey);
	            System.out.println("Decrypted Data..."+decryptedText);
	            
	            session.setAttribute("AES",""+bytesToHex(secKey.getEncoded()));
	            
	            session.setAttribute("ODATA",""+sb.toString());
	            
	            session.setAttribute("OKEYWORD",""+filekeyword);
	            
	        
	          
	            
	            session.setAttribute("AES1",""+bytesToHex(cipherText));
	            
	            
	            
	            secKeyword=getSecretEncryptionKeyword();
	          //  byte[] cipherTextKeyword = encryptTextKeyword(sb.toString(), secKeyword);
	            byte[] cipherTextKeyword = encryptTextKeyword(filekeyword, secKeyword);
		           
	            System.out.println("Keyword :"+filekeyword);
	            
	            
	            System.out.println("AES Key for keyword (Hex Form):"+bytesToHex(secKeyword.getEncoded()));
	            
	            System.out.println("Encrypted Text  Of keyword (Hex Form):"+bytesToHex(cipherTextKeyword));
	           
	            String decryptedTextKeyword = decryptTextKeyword(cipherTextKeyword, secKeyword);
	            System.out.println("Decrypted Keyword..."+decryptedTextKeyword);
	            
	            session.setAttribute("AES3",""+bytesToHex(secKeyword.getEncoded()));
	            
	            session.setAttribute("AES4",""+bytesToHex(cipherTextKeyword));
	            
	            /*  this code is used for send encryption key on mail */
	            String email1=(String) session.getAttribute("Name");
	            System.out.println("New Email id::::::::::::"+email1);
				
	            /*KeyOnMail key=new KeyOnMail();
				key.emailUtility(email1,""+bytesToHex(secKey.getEncoded()));
				
				KeyOnMailKeyword key1=new KeyOnMailKeyword();
				key1.emailUtility(email1,""+bytesToHex(secKeyword.getEncoded()));
				System.out.println("email1 address is"+email1);
				JOptionPane.showMessageDialog(null,"Valid UserName");*/
				
	            
	            
	            
	            
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	    		
	    		
	    		System.out.println("AES1 key:"+session.getAttribute("AES1"));
	    		System.out.println("AES4 key:"+session.getAttribute("AES4"));
	    		
	    		
	        }
	        
            HashCodeGenerator hs=new HashCodeGenerator();
           String hashcode= hs.generate(filename);
           
           String email2=(String) session.getAttribute("Name");
          
	        Connection conn = null; // connection to the database
	        String message = null;  // message will be sent back to client
	        Connection conn1 = null; 
	        try {
	            // connects to the database
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
	            
	            System.out.println("in db connection");
	            // constructs SQL statement
	            String sql = "insert into fileupload(id,filename,filetype,file,date,secretkey,filekeyword,keywordsecretkey,orignalfile,orignalkeyword,encryptedkeyword,hashvalue,owneremail)values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setString(1, id);
	            statement.setString(2, filename);
	            statement.setString(3, filetype);
	            statement.setString(5,DT);
	            statement.setString(7,filekeyword);
	            statement.setString(12,hashcode);
	            statement.setString(13,email2);
	           
	          //  statement.setBlob(3, inputStream);
	             
	            if (inputStream != null) {
	                // fetches input stream of the upload file for the blob column
	               // statement.setBlob(5, inputStream);
	            /*	statement.setBlob(4, inputStream);*/
	            	statement.setObject(4,session.getAttribute("AES1"));
	            	
	            	statement.setObject(6,session.getAttribute("AES"));
	            	
	            	statement.setObject(8,session.getAttribute("AES3"));
	            	
	            	statement.setObject(9,session.getAttribute("ODATA"));
	            	
	            	statement.setObject(10,session.getAttribute("OKEYWORD"));
	            	
	            	statement.setObject(11,session.getAttribute("AES4"));
	            }
	 
	            // sends the statement to the database server
	            int row = statement.executeUpdate();
	            if (row > 0) {
	              //  message = "File uploaded and saved into database";
	            	
	            	
	        		//JOptionPane.showMessageDialog(null, "File Upload SucessFully And Saved in DataBase");
	          
	              
	                
	        		 	        		
	        		long endtime=System.currentTimeMillis();
     	          //  System.out.println("Time For uploading="+(endtime-starttime));
     	            
	        		long uploadtime=endtime-starttime;
	        	//	System.out.println("Upload Time::::::::"+uploadtime);
	        		
	        		   
		 	        long ut1 = uploadtime / 1000 % 60;
		 	       session.setAttribute("Uploadtime","" +ut1);
	        	//	System.out.println("Final uploading time::"+ut1);
	        		
	        		
		            
	        		String sql1 = "insert into time(id,filename,time)values (?,?,?)";
	 	            PreparedStatement statement1 = conn.prepareStatement(sql1);
	 	           
	 	            statement1.setString(1,id);
	 	            statement1.setString(2,filename);
	 	            statement1.setLong(3,ut1);
	 	            
	 	           int row1 = statement1.executeUpdate();
	 	           
	 	          if (row1 > 0) {
		              //  message = "File uploaded and saved into database";
		        		//JOptionPane.showMessageDialog(null, "Time database");
	 	          }
	 	           
	 	           
	 	       //    System.out.println("filename.........."+filename);
	 	      //    System.out.println("TIME.........."+ut1);
	        		
	        	//	System.out.println("Doneeeeeeeee");
	        		
	            }
	        } catch (SQLException ex) {
	            message = "ERROR: " + ex.getMessage();
	            ex.printStackTrace();
	        } finally {
	            if (conn != null) {
	                // closes the database connection
	                try {
	                    conn.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            // sets the message in request scope
	            request.setAttribute("Message", message);
	           
	            
	            
	             
	            // forwards to the message page
	         //   getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
	            
	            out.println("<script type=\"text/javascript\">");
                out.println("alert('File Upload SucessFully And Saved in DataBase');");
                out.println("location='dataownerfileupload.jsp';");
                out.println("</script>");
               // getServletContext().getRequestDispatcher("/dataownerfileupload.jsp").include(request, response);
                
	           // response.sendRedirect("dataownerfileupload.jsp");
	        }
	        
		}
	}
	        
	        
	        
	public static SecretKey getSecretEncryptionKey() throws Exception{

        KeyGenerator generator = KeyGenerator.getInstance("AES");

        generator.init(128); // The AES key size in number of bits

        SecretKey secKey = generator.generateKey();
        

        return secKey;

}
	
	
	
	
	public static SecretKey getSecretEncryptionKeyword() throws Exception{
		System.out.println("in decryption Keyword");
     
		KeyGenerator generator = KeyGenerator.getInstance("AES");

        generator.init(128); // The AES key size in number of bits

        SecretKey secKeyword = generator.generateKey();
        

        return secKeyword;

}
	
	
	
	
	
	
	
	
	
	
	
	public static byte[] encryptText(String photo,SecretKey secKey) throws Exception{

	       // AES defaults to AES/ECB/PKCS5Padding in Java 7

	        Cipher aesCipher = Cipher.getInstance("AES");

	        aesCipher.init(Cipher.ENCRYPT_MODE, secKey);

	        byte[] byteCipherText = aesCipher.doFinal(photo.getBytes());

	        return byteCipherText;

	    }
	
	

	
	
	public static byte[] encryptTextKeyword(String photo,SecretKey secKeyword) throws Exception{

	       // AES defaults to AES/ECB/PKCS5Padding in Java 7

	        Cipher aesCipher = Cipher.getInstance("AES");

	        aesCipher.init(Cipher.ENCRYPT_MODE, secKeyword);

	        byte[] byteCipherTextKeyword = aesCipher.doFinal(photo.getBytes());

	        return byteCipherTextKeyword;

	    }  
	
	
	
    public static String decryptText(byte[] byteCipherText, SecretKey secKey) throws Exception {
      Cipher aesCipher = Cipher.getInstance("AES");

        aesCipher.init(Cipher.DECRYPT_MODE, secKey);

        byte[] bytePlainText = aesCipher.doFinal(byteCipherText);

        return new String(bytePlainText);

   }

    
    public static String decryptTextKeyword(byte[] byteCipherTextKeyword, SecretKey secKeyword) throws Exception {
        Cipher aesCipher = Cipher.getInstance("AES");

          aesCipher.init(Cipher.DECRYPT_MODE, secKeyword);

          byte[] bytePlainTextKeyword = aesCipher.doFinal(byteCipherTextKeyword);

          return new String(bytePlainTextKeyword);

     }
	        
	 private static String  bytesToHex(byte[] hash) {

	        return DatatypeConverter.printHexBinary(hash);

	    }
	 
	 
	 
	        


	}

