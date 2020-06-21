package com.Attacker.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;

import com.Attacker.Bean.FileUploadBean;






public class FileUploadDao {

	

	Connection con=null;
	public   Connection makeConnection(){
 		try{
 		      Class.forName("com.mysql.jdbc.Driver");
 		      System.out.println("driver loaded..");
 		
 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attacker", "root", "root");
 		    System.out.println("connection done..");
 		}
 		
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 		return con;
 	}

	
	public int deleteRecord(String query,FileUploadBean bean) 
	{
		Statement st=null;
		int i=0;
		try {
			
			 st=con.createStatement();
			i=st.executeUpdate(query);
			 return i;
			} 
		catch (SQLException e) 
		{			
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public ResultSet viewallinformation() {
		ResultSet rs=null;
		String sql = "Select * from fileupload";
		try {
			Statement stmt = con.createStatement();
		     rs = stmt.executeQuery(sql);
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		return rs;
	}
	
	
	
	public ResultSet newperticularlink(String id) {
		ResultSet rs=null;
		String sql = "Select file from fileupload where filename='"+id+ " '";
		try {
			Statement stmt = con.createStatement();
		     rs = stmt.executeQuery(sql);
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		return rs;
	}
	
	
	

	
	
	public ResultSet filedetails() {
		ResultSet rs=null;
		String sql = "Select * from fileupload";
		try {
			Statement stmt = con.createStatement();
		     rs = stmt.executeQuery(sql);
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		return rs;
	}
	
	
	public ArrayList<FileUploadBean> selectStore() throws Exception {
		// TODO Auto-generated method stub
		 String skey1=UUID.randomUUID().toString();
		ArrayList<FileUploadBean> loclist = new ArrayList<FileUploadBean>();
		String sql="Select * from fileupload";
		System.out.println("sql:="+sql);
		try {
			FileUploadDao dao=new FileUploadDao();
		PreparedStatement pstmt = (PreparedStatement) dao.makeConnection().prepareStatement(sql);
			
			//pstmt.setString(2, "%"+search +"%");
			
		//	Statement stmt = con.createStatement();
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				FileUploadBean bean=new FileUploadBean();
				System.out.println("select name");
				bean.setFilename(rs.getString(2));
				bean.setFiletype(rs.getString(3));
				
		
				loclist.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loclist;
	}


	
	public String getfname(String string) throws Exception {
		String filename = null;
		String key = null;
		String sql = "Select * from fileupload where filename ='"+string+"'";
		FileUploadDao dao=new FileUploadDao(); 
		Connection connection = (Connection) dao.makeConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			 
			ResultSet rs=null;
			rs = pstmt.executeQuery(sql);
			if(rs.next()){				
             filename=rs.getString(2);
         
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return filename;
	
	}
	
	
	public String getkey(String string) throws Exception {
		String filename = null;
		String key = null;
		String sql = "Select * from fileupload where filetype ='"+string+"'";
		FileUploadDao dao=new FileUploadDao(); 
		Connection connection = (Connection) dao.makeConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			 
			ResultSet rs=null;
			rs = pstmt.executeQuery(sql);
			if(rs.next()){				
             filename=rs.getString(3);
         
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return filename;
	
	}
	
	
	
}
