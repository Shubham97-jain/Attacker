package com.Attacker.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.Attacker.Bean.DataOwnerBean;
import com.Attacker.Bean.UserBean;



/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/DataOwnerLogin")
public class DataOwnerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DataOwnerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int id=Integer.parseInt(request.getParameter("id"));

		PrintWriter out;
		out=response.getWriter();

		try
		{
			System.out.println("id"+id);
			DataOwnerBean bean=new DataOwnerBean();
			bean.setId1(id);
			int a = bean.deleteRecord();
			
			System.out.println("result"+a);
		
			if(a>0)
			{
				
			   	out.println("<script type=\"text/javascript\">");
			       out.println("alert('Record deleted successfully');");
			       out.println("location='viewdataowner.jsp';");
			       out.println("</script>");	
				 
				/* JOptionPane.showMessageDialog(null,"Record deleted successfully");
				response.sendRedirect("viewdataowner.jsp");*/
				
			}
			
			
			
			
		}
		catch(Exception e)
		{

			out.println("<script type=\"text/javascript\">");
		       out.println("alert('Record Not deleted successfully');");
		       out.println("location='viewdataowner.jsp';");
		       out.println("</script>");
		       
			
		}


	}
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		String btn=request.getParameter("submit");
		PrintWriter out;
		out=response.getWriter();


		if(btn.equals("SignUp"))
		{
try{
	System.out.println("in servlet...");
	
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String confirmpassword=request.getParameter("confirmpassword");

	String contact=request.getParameter("contact");
	
	
	System.out.println(""+name);
	System.out.println(""+id);
	
//	System.out.println("value are="+name+""+""+email+""+password+""+passwd+""+address+""+gender+""+education+""+dob+""+contact+""+s+"");
	
	// here we first set the attribute 
	//request.setAttribute("id", id);
	HttpSession ht=request.getSession(true);
	HttpSession sanket=request.getSession(true);
	
	sanket.setMaxInactiveInterval(100);
	

	ht.setAttribute("id",id);
	ht.setAttribute("name",name);
	ht.setAttribute("email",email);
	ht.setAttribute("password",password);
	ht.setAttribute("confirmpassword",confirmpassword);
	ht.setAttribute("contact",contact);

	
	
	// this is used for generate otp
	Random r=new Random();
	int j=r.nextInt(1000);
	System.out.println("Registration OTP is :"+j);
	
	String key=""+j;
	sanket.setAttribute("key", key);
	
	// this is used for send otp to mail
	KeyOnMail kom=new KeyOnMail();
	
	kom.emailUtility(email, ""+j);
	System.out.println("sent");
	

    
    
  request.getRequestDispatcher("dataownerregistrationotp.jsp").forward(request, response);
  

  
	
}catch(Exception e){
	
}

}
		
		
		
		
if(btn.equals("OTPSubmit"))
{
	HttpSession ht=request.getSession(true);
	String key=(String)request.getSession(false).getAttribute("key");
	
	String otp=request.getParameter("otp");
	
	//String id=(String)ht.getAttribute("id");
	String id=(String)ht.getAttribute("id");
	String name=(String)ht.getAttribute("name");
	String email=(String)ht.getAttribute("email");
	String password=(String)ht.getAttribute("password");
	String confirmpassword=(String)ht.getAttribute("confirmpassword");
	
	String contact=(String)ht.getAttribute("contact");
	
	 
	System.out.println("name"+name);
	System.out.println("id"+id);
	DataOwnerBean bean=new DataOwnerBean();
   bean.setId(id);
bean.setName(name);
bean.setEmail(email);
bean.setPassword(password);
bean.setConfirmpassword(confirmpassword);
bean.setContact(contact);
if(key.equals(otp))
{
int i=bean.insertData();

if(i>0)
{
	out.println("<script type=\"text/javascript\">");
    out.println("alert('Registration SucessFully');");
    out.println("location='dataownerlogin.jsp';");
    out.println("</script>");
	
/*JOptionPane.showMessageDialog(null, "Registration SucessFully");
request.getRequestDispatcher("dataownerlogin.jsp").forward(request, response);*/
}
else
	
	out.println("<script type=\"text/javascript\">");
out.println("alert('Registration Fail');");
out.println("location='dataownerregistrationotp.jsp';");
out.println("</script>");

//response.sendRedirect("dataownerregistrationotp.jsp");

}


else
{
	//HttpSession ht=request.getSession(true);
	ht.invalidate();
	out.println("<script type=\"text/javascript\">");
	out.println("alert('Registration Fail');");
	out.println("location='dataownerregistration.jsp';");
	out.println("</script>");
	
	//response.sendRedirect("dataownerregistration.jsp");
}


}






if(btn.equals("Login"))
{

	String email,password;
	//boolean login=false;
	System.out.println("in loginservelet..");
	
	email=request.getParameter("email");
	password=request.getParameter("password");
    System.out.println("email="+email+"password="+password);
	 
    DataOwnerBean bean=new DataOwnerBean();
	bean.setEmail(email);
	bean.setPassword(password);
	
	String i= bean.dataownerlogin();

	System.out.println("i="+i);
	/*login=control.reglogin(bean);
	System.out.println("value of login="+login);
	*/
	if(i!=null){
		HttpSession session=request.getSession(true);
		session.setAttribute("Name", i);
		session.setAttribute("Name","" +email); // this is used for display name in profile
		session.setAttribute("Username","" +email);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Login SucessFully');");
		out.println("location='dataownerhome.jsp';");
		out.println("</script>");
		/*response.sendRedirect("dataownerhome.jsp");
		JOptionPane.showMessageDialog(null, "Login SucessFully");
		*/
	        //request.getRequestDispatcher("home.jsp").forward(request, response);	
	     //   request.setAttribute(", arg1);
		
		}
    
	else{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Email and Password is incorrect');");
		out.println("location='dataownerlogin.jsp';");
		out.println("</script>");
		
		/*JOptionPane.showMessageDialog(null, "Email and Password is incorrect");
		request.setAttribute("msg","Email and Password is incorrect");
		request.getRequestDispatcher("dataownerlogin.jsp").include(request, response);*/
	}

}





if(btn.equals("Forgot"))
{
	//JOptionPane.showMessageDialog(null,"forgot login00");
	//forgot password
	String foruname=request.getParameter("name");
	System.out.println("forrgggggggggggg"+foruname);
	
	DataOwnerBean bean=new DataOwnerBean();
	bean.setEmail(foruname);
	System.out.println("forgot passs");
    HttpSession session=request.getSession();
    HttpSession sanket1=request.getSession(true);
	session.setAttribute("name",foruname);
	
	boolean flag=bean.checkForgotPassword();
	if(flag)
	{
		Random otp=new Random();
		int otp1=otp.nextInt(1000);
		System.out.println(" New Forgot OTP  :"+otp1);
		session.setAttribute("OTP", otp1);
		String email=foruname;
		
		
		KeyOnMail kom=new KeyOnMail();
		
		kom.emailUtility(email, ""+otp1);
		sanket1.setAttribute("OTP", otp1);
		System.out.println("sent");
		
		
		
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Valid UserName');");
		out.println("location='dataownerforgotpasswordotp.jsp';");
		out.println("</script>");
		
/*		JOptionPane.showMessageDialog(null,"Valid UserName");
		
		response.sendRedirect("dataownerforgotpasswordotp.jsp");*/
	}
	else
	{
		out.println("<script type=\"text/javascript\">");
		out.println("alert('You are not a Register Member plz sign up first');");
		out.println("location='dataownerlogin.jsp';");
		out.println("</script>");
		
		
	
		
	}
}


if(btn.equals("OTPForgotSubmit"))
{
	System.out.println("in submitOTP");
	
	//int otpcheck=i;
	int otp=Integer.parseInt(request.getParameter("otp"));
	HttpSession session=request.getSession();
	//int otpcheck=i;
	int newotp=(int) session.getAttribute("OTP");
//	System.out.println("otpcheck"+new);
	System.out.println("newOtp"+newotp);
	if(otp==newotp)
	{

		out.println("<script type=\"text/javascript\">");
		out.println("alert('OTP Match Now u can change Password');");
		out.println("location='dataownerchangeforgotpassword.jsp';");
		out.println("</script>");
		
		
	
		
	}
	else
	{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Plz enter Correct OTP');");
		out.println("location='dataownerforgotpasswordotp.jsp';");
		out.println("</script>");
		
		
	/*	JOptionPane.showMessageDialog(null, "Plz enter Correct OTP");
		System.out.println("Plz enter correct Otp");
		response.sendRedirect("dataownerforgotpasswordotp.jsp");*/
	}

}


if(btn.equals("Change"))
{
	HttpSession session=request.getSession();
	String email=(String) session.getAttribute("name");
	String password=request.getParameter("password");
	String confirmpassword=request.getParameter("confirmpassword");
	System.out.println("email"+email);
	System.out.println("in Change Button");
	
	DataOwnerBean bean=new DataOwnerBean();
	
	bean.setEmail(email);
	bean.setPassword(password);
	bean.setConfirmpassword(confirmpassword);

	try
	{
	int i=bean.changePassword();
	System.out.println("in Change password"+i);
	if(i>0)
	{
		out.println("<script type=\"text/javascript\">");
		out.println("alert('password Change Sucessfully');");
		out.println("location='dataownerlogin.jsp';");
		out.println("</script>");
		
		
		
		
		
	}
	else
	{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Unsucessful change Password');");
		out.println("location='forgotpassword.jsp';");
		out.println("</script>");
		
		/*System.out.print("Unsucessful change Password");
		response.sendRedirect("forgotpassword.jsp");*/
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}


	}

		
		
		
	}


