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


<div class="top_banner two">
			<div class="container">
			       <div class="sub-hd-inner">
						<!-- <h3 class="tittle">Data  <span>Owner</span> File <span>Upload</span></h3> -->
					
					
		
<div class="form-group" style="color:;margin-left:30px;margin-right:30px;margin-top:100px;margin-bottom:100px;">
<div class="col-md-10">

    <center>
        <h2 align="center" > <b>File Upload  For Data Owner Information </b> </align></h2>  
        <br><br><br>
        
        <form method="post" action="UploadKeyword" enctype="multipart/form-data">
           
                <tr>
                    <td > File name: </td> 
                <input type="text" name="filename" size="50" required/>
                </tr>  <br>  <br>    <br> 
                <tr>
                    <td>File First Keyword: </td> <input type="text" name="filetype" size="50" required/>
                </tr>  <br>  <br>    <br> 
                <tr>  
                  <tr>
                    <td>File Second Keyword: </td>
                    <td><input type="text" name="filekeyword" size="50" required/></td>
                </tr>  <br>  <br>    <br> 
                <tr>  
                    <td>File: </td>
                    <td><input type="file" name="file" size="50" required/></td>
                      
                </tr>

           			<input type="submit" value="Save" name="submit" value="UploadImage">
            
        </form>
    </center>
    </div>
    </div>
    
					
</div>
</div>
    
					
</div>
</div>




</div>


<br><br><br><br><br><br><br><br><br><br>










<br><br>









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
<p>Attack prevention and detection using Access Control Encrypted Cloud Storage</p>
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