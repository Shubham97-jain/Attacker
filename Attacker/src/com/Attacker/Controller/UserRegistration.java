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




import com.Attacker.Bean.UserBean;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
    public UserRegistration() {
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
			UserBean bean=new UserBean();
			bean.setId1(id);
			int a = bean.deleteRecord();
			
			System.out.println("result"+a);
		
			if(a>0)
			{
				out.println("<script type=\"text/javascript\">");
			       out.println("alert('Record deleted successfully');");
			       out.println("location='viewusers.jsp';");
			       out.println("</script>");
			       
				
			}
			
			
			
			
		}
		catch(Exception e)
		{

			out.println("<script type=\"text/javascript\">");
		       out.println("alert('Record Not deleted successfully');");
		       out.println("location='viewusers.jsp';");
		       out.println("</script>");
		       
			
		//	JOptionPane.showMessageDialog(null,"error");
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
	String gender=request.getParameter("gender");
	String dob=request.getParameter("dob");
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
	ht.setAttribute("dob",dob);
	ht.setAttribute("contact",contact);
	ht.setAttribute("gender",gender);
	
	
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
	
	
	request.getRequestDispatcher("registrationotp.jsp").forward(request, response);
	
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
	String dob=(String)ht.getAttribute("dob");
	String contact=(String)ht.getAttribute("contact");
	String gender=(String)ht.getAttribute("gender");
	 
	System.out.println("name"+name);
	System.out.println("id"+id);
   UserBean bean=new UserBean();
   bean.setId(id);
bean.setName(name);
bean.setEmail(email);
bean.setPassword(password);
bean.setConfirmpassword(confirmpassword);
bean.setDob(dob);
bean.setContact(contact);
bean.setGender(gender);
if(key.equals(otp))
{
int i=bean.insertData();

if(i>0)
{
	
	out.println("<script type=\"text/javascript\">");
    out.println("alert('Registration SucessFully');");
    out.println("location='userlogin.jsp';");
    out.println("</script>");
	
/*JOptionPane.showMessageDialog(null, "Registration SucessFully");
request.getRequestDispatcher("userlogin.jsp").forward(request, response);*/
}
else
	
	out.println("<script type=\"text/javascript\">");
out.println("alert('Registration Fail');");
out.println("location='registrationotp.jsp';");
out.println("</script>");



}


else
{
	//HttpSession ht=request.getSession(true);
	ht.invalidate();
	
	out.println("<script type=\"text/javascript\">");
    out.println("alert('Registration Fail');");
    out.println("location='userregistration.jsp';");
    out.println("</script>");
    

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
	 
    UserBean bean=new UserBean();
	bean.setEmail(email);
	bean.setPassword(password);
	
	String i= bean.userlogin();

	System.out.println("i="+i);
	/*login=control.reglogin(bean);
	System.out.println("value of login="+login);
	*/
	if(i!=null){
		HttpSession session=request.getSession(true);
		session.setAttribute("Name", i);
		session.setAttribute("Username",email); // this is used for display name in profile
		/*response.sendRedirect("userhome.jsp");
		JOptionPane.showMessageDialog(null, "Login SucessFully");*/
		
		out.println("<script type=\"text/javascript\">");
	    out.println("alert('Login SucessFully');");
	    out.println("location='userhome.jsp';");
	    out.println("</script>");
		
	        //request.getRequestDispatcher("home.jsp").forward(request, response);	
	     //   request.setAttribute(", arg1);
		
		}
    
	else{
	/*	JOptionPane.showMessageDialog(null, "Email and Password is incorrect");
		request.setAttribute("msg","Email and Password is incorrect");
		request.getRequestDispatcher("userlogin.jsp").include(request, response);
		*/
		out.println("<script type=\"text/javascript\">");
	    out.println("alert('Email and Password is incorrect');");
	    out.println("location='userlogin.jsp';");
	    out.println("</script>");
		
		
	}

}





if(btn.equals("Forgot"))
{
	//JOptionPane.showMessageDialog(null,"forgot login00");
	//forgot password
	String foruname=request.getParameter("name");
	System.out.println("forrgggggggggggg"+foruname);
	
	 UserBean bean=new UserBean();
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
		out.println("location='forgotpasswordotp.jsp';");
		out.println("</script>");
	
	
	/*	KeyOnMail key=new KeyOnMail();
		key.emailUtility("email", " "+otp1);*/
	/*	
		JOptionPane.showMessageDialog(null,"Valid UserName");
		
		response.sendRedirect("forgotpasswordotp.jsp");*/
	}
	else
	{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('You are not a Register Member plz sign up first');");
		out.println("location='userlogin.jsp';");
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
		out.println("location='changeforgotpassword.jsp';");
		out.println("</script>");

		
		
	}
	else
	{
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Plz enter Correct OTP');");
		out.println("location='forgotpasswordotp.jsp';");
		out.println("</script>");
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
	
	UserBean bean=new UserBean();
	
	bean.setEmail(email);
	bean.setPassword(password);
	bean.setConfirmpassword(confirmpassword);

	try
	{
	int i=bean.changePassword();
	System.out.println("in Change password"+i);
	if(i>0)
	{
	/*	JOptionPane.showMessageDialog(null, "password Change Sucessfully");
		System.out.print("successful change Password");
		response.sendRedirect("userlogin.jsp");
		*/
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('password Change Sucessfully');");
		out.println("location='userlogin.jsp';");
		out.println("</script>");
		
	}
	else
	{
		
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('password Change Sucessfully');");
		out.println("location='forgotpassword.jsp';");
		out.println("</script>");
		
		
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}






	}

}
