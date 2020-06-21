package com.Attacker.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

import com.Attacker.Bean.UserBean;




@WebServlet("/ValidUser")
public class ValidUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValidUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 HttpSession session=request.getSession(true);
			 String btn=request.getParameter("submit");
		
			System.out.println("before submit btn");
			
			if(btn.equals("Valid"))
			{
				String foruname=request.getParameter("name");
				String file=(String)request.getSession(false).getAttribute("file");
				System.out.println("hellloooooooooooooooooooooooooooooo:"+file);
				System.out.println("Valid"+foruname);
				
				UserBean bean=new UserBean();
				bean.setFile(file);
				System.out.println("valid ...");
			   
				
				
				ResultSet rs=bean.validuser();
				String key1=null,key2=null;
				while(rs.next())
				{
					key1=rs.getString(6);
					key2=rs.getString(8);
				}
				
					
						
					KeyOnMail mail1=new KeyOnMail();
					mail1.emailUtility(foruname,""+key1);
					
					
					KeyOnMailKeyword mail2=new KeyOnMailKeyword();
					mail2.emailUtility(foruname,""+key2);
					/*System.out.println("email1"+email1);*/
					JOptionPane.showMessageDialog(null,"Valid UserName");
					
					response.sendRedirect("secretkey.jsp");
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "You are not a Register Member plz sign up first");
				System.out.println("You are not a Register Member plz sign up first");
					response.sendRedirect("validdatauser.jsp");
					
					
				}
		
			
			
			
			if(btn.equals("SecretKeySubmit"))
			{
				System.out.println("in submitOTP");
				
				
				
				
				String u1=(String) session.getAttribute("file");
				String u2=(String) session.getAttribute("index");
				
				
				
				
				//int otpcheck=i;
				int newotp=(int) session.getAttribute("OTP");
//				System.out.println("otpcheck"+new);
				System.out.println("newOtp"+newotp);
				if(u1==u2)
				{

					JOptionPane.showMessageDialog(null, "U can enter Correct Secret key");
					System.out.println("Correct secret Key");
					response.sendRedirect("download.jsp");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Plz enter Correct Secret Key");
					System.out.println("Plz enter secret Key");
					response.sendRedirect("secretkey.jsp");
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 private static String  bytesToHex(byte[] hash) {

	        return DatatypeConverter.printHexBinary(hash);

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
	}
