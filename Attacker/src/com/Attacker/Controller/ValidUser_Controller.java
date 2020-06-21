package com.Attacker.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.Attacker.Bean.UserBean;

@WebServlet("/ValidUser_Controller")
public class ValidUser_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValidUser_Controller() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		 HttpSession session=request.getSession(true);
		 String btn=request.getParameter("submit");
	    String foruname=(String)session.getAttribute("Username");
		System.out.println("before submit btn");
		System.out.println("validate User....");
		
	//	String file=(String)request.getSession(true).getAttribute("file");
		
		String file=request.getParameter("file");
		
		
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
	  if(key1!=null)
		{
			JOptionPane.showMessageDialog(null,"Successfully Send key on mail..please check");
			
			response.sendRedirect("secretkey.jsp");
		}
		else
		{
			
			JOptionPane.showMessageDialog(null, "You are not a Register Member plz sign up first");
		    System.out.println("You are not a Register Member plz sign up first");
			response.sendRedirect("validdatauser.jsp");
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}

}
