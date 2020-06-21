<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Bike Race Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design"/>
<!-- fonts -->
<link href="//fonts.googleapis.com/css?family=Michroma" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Comfortaa:300,400,700" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
<link href='css/aos.css' rel='stylesheet prefetch' type="text/css" media="all" />
<link href="css/pogo-slider.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css -->

<script type="text/javascript">

onload=function()
{
	 
	var e=document.getElementById("refreshed");
	
	if(e.value=="no")
		e.value="yes";
	else
		{
		e.value="no";
		location.reload(); 
		}
	
	
	}

</script>
</head>
<body>
<!-- navigation -->
<nav class="navbar navbar-default navbar-fixed-top" data-aos="flip-up">
    <div class="container">
		
        <div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp"><h1>Attacker System</h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			
				<ul class="nav navbar-nav slide-nav">
				<li class="active current"><a href="userhome.jsp">Home</a></li>
				<li class="active current"><a href="userprofile.jsp">Profile</a></li>
				<li class="active current"><a href="filedetails.jsp">File details</a></li>
				    <li><a href="datausersearch.jsp">Search File</a></li>
				
				
                        
            

		        <li class="active current"><a href="logout.jsp">Logout</a></li>
			</ul>
			
			
			
        </div><!--/.nav-collapse -->	
        
        		 <ul align="right">
															<input type="hidden" id="refreshed" value="no"/>
                 <%
                 if(session.getAttribute("Name")!=null) 

                         {%>
	
                             <li style="color:white">Welcome   <% out.print(session.getAttribute("Name"));%>
</li> 
</ul>	
    </div>
</nav>
<!-- /navigation --> 
<!-- Page Content -->
<!-- header section -->
<section class="inner-w3ls">
    <div class="container">
		<h3 class="text-center" data-aos="zoom-in">User</h3>
        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <ol class="breadcrumb" data-aos="zoom-in">
                    <li><a href="#">Home</a>
                    </li>
                    <li class="active">User</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->
	</div>
</section>	
<!-- /header section -->







<div class="top_banner two">
		
		
		<form method="post"  action="#">
			<div class="col-md-12">
				<h2 align="center" style="color:Black;font-family:Cambria;font-size:25px;"> Search File</h2>
			</div>
		<center>
      <table border="0" width="300" align="center" bgcolor="#e9f">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
      <!--   <h3><center>Search File</center></h3></td></tr><br><br><br> -->
        <tr><td ><b>Enter Name</b></td>
          <td>: <input  type="text" name="pid" id="pid">
        </td></tr> <br> &nbsp    &nbsp   
        <tr><td colspan=2 align="center"><br><br>
           <center> <input  type="submit" name="submit" value="Search"></td></tr>    <center>
      
      
      </table>
      
      </center>   
    </form>
	
	
	
		
		</div>
	

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>







<%}

else
{%>

<%response.sendRedirect("userlogin.jsp");%>

<% }%>
<!-- last section -->
<section class="last-w3layouts">
	<div class="container">
		<a href="index.html" class="bottom-agile"><h2 class="text-center">Attacker System</h2></a>
		<div class="copyright">
<p>Attack prevention and detection using Access Control Encrypted Cloud Storage </p>
</div>
	</div>	
</section>
<!-- last section -->
<!-- back to top -->
<a href="#0" class="cd-top">Top</a>
<!-- /back to top -->	
<!-- js files -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/SmoothScroll.min.js"></script>
<script src="js/top.js"></script> 
<script src="js/modernizr.min.js"></script>
<script src="js/index.js"></script>
<script src='js/aos.js'></script>
<script src="js/aos2.js"></script>
<!-- js for team section -->
<script src="js/toucheffects.js"></script>
<!-- /js for team section -->
<!-- js for about section -->
<script src="js/jquery.pogo-slider.min.js"></script>
<script src="js/main.js"></script>
<!-- /js for about section -->
<!-- /js files -->
</body>
</html>	