package com.Attacker.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Attacker.Bean.UserBean;

import java.sql.*;

public class UserRegistrationDao {

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

	
	

	public int insertData(String query ,UserBean bean) 
	{
		try{
			System.out.println("in  insert data dao..");
			PreparedStatement pst=con.prepareStatement(query);
			/*pst.setInt(1,0);
			pst.setString(2,bean.getName());
			pst.setString(3,bean.getEmail());
			pst.setString(4,bean.getPassword());
			pst.setString(5,bean.getConfirmpassword());
			pst.setString(6, bean.getDob());
			pst.setString(7,bean.getContact());
			pst.setString(8,bean.getGender());
		*/	
			pst.setString(1,bean.getId());
			pst.setString(2,bean.getName());
			pst.setString(3,bean.getEmail());
			pst.setString(4,bean.getPassword());
			pst.setString(5,bean.getConfirmpassword());
			pst.setString(6, bean.getDob());
			pst.setString(7,bean.getContact());
			pst.setString(8,bean.getGender());
			
			
			int i=pst.executeUpdate();
			System.out.println("query done..");
			return i;
			
		}catch(Exception e){
			e.printStackTrace();
		
		
		}
		return 0;
	}

	public String userlogin(String query, UserBean bean) {
		// TODO Auto-generated method stub
		//boolean login=false;
		try{
			System.out.println("in userlogin..");
			
			String username=bean.getEmail();
			String password=bean.getPassword();
			System.out.println("values in dao="+username+""+password);
		   
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,username);
			pst.setString(2,password);
			ResultSet rs=pst.executeQuery();
		   System.out.println("Query done in login..");
		   
		   if(rs.next()){
			  
			  String name=rs.getString(2);
			  System.out.println("in rs");
			   return name;
		   }
		   
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public ResultSet searchForgotPassword(String query) 
	{
		Statement st=null;
		ResultSet rs=null;
	try {
			st= con.createStatement();
			System.out.println("In Search ForgotPassword DAO");
			rs=st.executeQuery(query);
		} 
	
	catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int changeForgotPassword(String query, UserBean bean)throws Exception
	{
		PreparedStatement ps=null;
		//ResultSet rs=null;
		System.out.println("in change password");
		ps=con.prepareStatement(query);
		//ps.setString(2,login.getEmail());
	 // ps.setString(1, login.getEmail());
	    ps.setString(1, bean.getPassword());
		ps.setString(2, bean.getConfirmpassword());
		int i=ps.executeUpdate();
		return i;
		
	}
	
	
	public ResultSet selectAllUsers() {
		ResultSet rs=null;
		String sql = "Select * from userregistration";
		try {
			Statement stmt = con.createStatement();
		     rs = stmt.executeQuery(sql);
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		return rs;
	}
	
	
	
	public int deleteRecord(String query,UserBean bean) 
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
	
	
	
	public ResultSet selectUser(String username) {
		ResultSet rs=null;
		System.out.println("name"+username);
		String sql = "Select * from userregistration where email='"+username+"'";
		try {
			Statement stmt = con.createStatement();
		     rs = stmt.executeQuery(sql);
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		return rs;
	}
	
	
	
	
	
	public ResultSet uservalid(String query) throws SQLException
	{
		Statement st=null;
		ResultSet rs=null;
	
			st= con.createStatement();
			System.out.println("In vaalid user DAO");
			rs=st.executeQuery(query);
		
		return rs;
	}
	
	
	
}
