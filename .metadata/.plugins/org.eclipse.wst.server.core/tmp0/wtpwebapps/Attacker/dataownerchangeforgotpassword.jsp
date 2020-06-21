<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta name="keywords" content="Validation Signup Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- fonts -->
<link href="//fonts.googleapis.com/css?family=Muli:300,400" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="registration/css/bootstrap.css" rel="stylesheet" type='text/css' media="all" />
<link href="registration/css/style.css" rel="stylesheet" type='text/css' media="all" />
<!-- /css -->
</head>
<body>



        
<h1 class="w3ls">Change Password</h1>
	<div class="content-agileits">
		<form action="DataOwnerLogin" method="post" data-toggle="validator" role="form">
			
		
		
		
		
			
			
			
		   
			<div class="form-group agile agileits-w3layouts w3-agile">
				<label for="inputPassword" class="control-label">Password</label>
				<div class="form-inline row">
					<div class="form-group col-sm-6 agileits-w3layouts">
						<input type="password"  name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  data-minlength="6" class="form-control" id="inputPassword" placeholder="Password" required>
						<div class="help-block">Enter Valid Pattern</div>
					</div>
					<div class="form-group col-sm-6 w3-agile">
						<input type="password"  name="confirmpassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="Confirm Password" required>
						<div class="help-block with-errors"></div>
					</div>
				</div>
			</div>
			
			
	   
	           
	   
	   
			<div class="form-group">
				<button type="submit" class="btn btn-lg" name="submit" value="Change" >Change Password </button> <br>
			
			</div>
			
			
			
		</form>
    </div>
<div class="copyright">
					
</div>
<!-- js files -->
<script src="registration/js/jquery-1.10.2.min.js"></script>
<script src="registration/js/bootstrap.min.js"></script>
<script src="registration/js/validator.min.js"></script>
<!-- /js files -->
</body>
</html>

 