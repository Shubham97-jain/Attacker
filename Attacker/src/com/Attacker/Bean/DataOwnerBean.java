package com.Attacker.Bean;

import java.sql.ResultSet;

import com.Attacker.DAO.DataOwnerDao;





public class DataOwnerBean {


	private String id,name,email,password,confirmpassword,contact;
	private int id1;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


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




	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public int getId1() {
		return id1;
	}



	public void setId1(int id1) {
		this.id1 = id1;
	}




	public int insertData() 
	{
		String query="insert into dataownerregistration values(?,?,?,?,?,?)";
		DataOwnerDao dao=new DataOwnerDao();
		dao.makeConnection();
		int i=dao.insertData(query,this);
		
		return i;
	}
	
	
	public String dataownerlogin()
	{
		String query="select * from dataownerregistration where email=? and password=?";
		
		DataOwnerDao dao=new DataOwnerDao();
		dao.makeConnection();
		String rs=dao.dataownerlogin(query,this);
		
		return rs;
		
		
	}
	
	
	public boolean checkForgotPassword() 
	{
		String query="select * from dataownerregistration where Email='"+getEmail()+"'";
		DataOwnerDao dao=new DataOwnerDao();
	    dao.makeConnection();
		ResultSet rs= dao.searchForgotPassword(query);
		
		try
		{
			rs.next();
			if(getEmail().equals(rs.getString(3)))
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	public int changePassword()throws Exception 
	{
		String query="UPDATE dataownerregistration SET password=? , confirmpassword=? WHERE email='"+getEmail()+"' ";
		DataOwnerDao dao=new DataOwnerDao();
		dao.makeConnection();
		int i=dao.changeForgotPassword(query,this);
		/*try
		{
			rs.next();
			if()
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		return i;
	}
	
	
	public int deleteRecord()
	{
		String query="delete from dataownerregistration where id="+getId1()+"";
		
		DataOwnerDao dao=new DataOwnerDao();
		dao.makeConnection();
		int i=dao.deleteRecord(query,this);
		return i;
		
	}
	
	
	
	
	
}
