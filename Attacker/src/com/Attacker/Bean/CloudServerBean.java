package com.Attacker.Bean;

import java.sql.ResultSet;

import com.Attacker.DAO.CloudServerDao;




public class CloudServerBean {

	private String email,password,confirmpassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	public boolean cloudlogin()
	{
		String query="select * from  cloudserverlogin where cloud_email='"+getEmail()+"' AND cloud_password='"+getPassword()+"'";
		
		CloudServerDao dao=new CloudServerDao();
		dao.makeConnection();
		ResultSet rs=dao.cloudlogin(query);
		 try
		 {
		   rs.next();
			
			 System.out.println("in cloud bean try");
			   if(getEmail().equals(rs.getString(1)) && getPassword().equals(rs.getString(2)))
			   {
				 
				 
				   return true;
				   
			   }
		   
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		return false;
		
		
	}
	
	
	
	
	
	
}
