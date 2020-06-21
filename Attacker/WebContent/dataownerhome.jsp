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
				<li class="active current"><a href="dataownerhome.jsp">Home</a></li>
				<li class="active current"><a href="dataownerprofile.jsp">Profile</a></li>
				 <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">File Upload<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                 <li class="active current"><a href="dataownerfileupload.jsp">Using AES</a></li>              
                  <li class="active current"><a href="#">Using Fragments</a></li>
				<li class="active current"><a href="#">Using Replica's</a></li>
              </ul>
            </li>
				<li class="active current"><a href="dataownerfiledetails.jsp">File Details</a></li>
				
				 <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Graph<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                  <li class="active current"><a href="#">AES Difference Graph</a></li>
                <li class="active current"><a href="#">Uploading Time</a></li>
                

              </ul>
            </li>
				
				
				<li class="active current"><a href="logout.jsp">Logout</a></li>
			
			</ul>
			
			 <ul align="right">
					<input type="hidden" id="refreshed" value="no"/>
                 <%
                 if(session.getAttribute("Name")!=null) 

                         {%>
	
                             <li style="color:white">Welcome   <% out.print(session.getAttribute("Name"));%>
</li> 
</ul>
        </div><!--/.nav-collapse -->		
    </div>
</nav>
<!-- /navigation --> 
<!-- Page Content -->
<!-- header section -->
<section class="inner-w3ls">
    <div class="container">
		<h3 class="text-center" data-aos="zoom-in">Data Owner Home</h3>
        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <ol class="breadcrumb" data-aos="zoom-in">
                    <li><a href="index.html">Home</a>
                    </li>
                    <li class="active">Data Owner</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->
	</div>
</section>	
<!-- /header section -->
<section class="about-w3layouts">
	<div class="container">
        <!-- Intro Content -->
        <div class="row">
            <div class="col-md-6" data-aos="flip-left">
                 <div class="pogoSlider" id="js-main-slider">
					<div class="pogoSlider-slide" data-transition="blocksReveal" data-duration="1000"  style="background-image:url(images/a1.png);background-position:center;"></div>
					<div class="pogoSlider-slide " data-transition="blocksReveal" data-duration="1000"  style="background-image:url(images/a2.jpg);background-position:center;"></div>
					<div class="pogoSlider-slide " data-transition="blocksReveal" data-duration="1000"  style="background-image:url(images/a3.gif);background-position:center;"></div>
				</div>
            </div>
            <div class="col-md-6" data-aos="flip-right">
                <h3>Data Owner</h3>
               In our system,contain different data owners can upload a different file on a cloud server at a encrypted format.Different data owners can upload files on a cloud so for every file.
				
            </div>
        </div>
        <!-- /.row -->
	</div>
</section>

<%}

else
{%>

<%response.sendRedirect("dataownerlogin.jsp");%>

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