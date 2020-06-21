package com.Attacker.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.Attacker.Bean.CloudServerBean;



/**
 * Servlet implementation class CloudServerLogin
 */
@WebServlet("/CloudServerLogin")
public class CloudServerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CloudServerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	String btn=request.getParameter("submit");
	PrintWriter out;
	out=response.getWriter();
		
		if(btn.equals("Login"))
		{
			String email,password;
			//boolean login=false;
			System.out.println("in Cloud Servlet login servelet..");
			
			email=request.getParameter("email");
			password=request.getParameter("password");
		    System.out.println("email="+email+"password="+password);
			 
		    CloudServerBean bean=new CloudServerBean();
			bean.setEmail(email);
			bean.setPassword(password);
			
			boolean i;
			try {
				i = bean.cloudlogin();
		
			
		
			//System.out.println("value of login="+login);
			
			if(i){
				
				HttpSession session=request.getSession(true);
				session.setAttribute("Name", email);
				
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Login SucessFully');");
				out.println("location='cloudserverhome.jsp';");
				out.println("</script>");
				
			/*	response.sendRedirect("cloudserverhome.jsp");
				JOptionPane.showMessageDialog(null, "Login SucessFully");*/
				
			        //request.getRequestDispatcher("home.jsp").forward(request, response);	
			     //   request.setAttribute(", arg1);
				
				}
		    
			else{
				
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Email and Password is incorrect');");
				out.println("location='cloudserverlogin.jsp';");
				out.println("</script>");
				
			
			}
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		

	}
		
		
		
		
		
	}

