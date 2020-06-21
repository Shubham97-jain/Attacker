package com.Attacker.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CloudServerDao {

	
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

	
	
       public ResultSet cloudlogin(String query) {
		// TODO Auto-generated method stub
		//boolean login=false;
		ResultSet rs=null;
		try{
			System.out.println("in Cloud Server login Dao..");
			
		
			Statement st=con.createStatement();
			System.out.println(st);
			System.out.println("hi i am in Cloud Server login");
			rs=st.executeQuery(query);
			System.out.println("query="+rs);
		   System.out.println("  Cloud Server Query done in login..");
		//  return rs;
		   
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return rs;
		
	}

}
