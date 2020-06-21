<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
 <%@page import="java.sql.ResultSet"%>

<%@page import="com.Attacker.DAO.FileUploadDao"%>
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
				
				 <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Search File<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="datausersearch.jsp">Search File</a></li>
                <li><a href="md5search.jsp">MD5 Search</a></li>
                <li><a href="fuzzykeywordsearch.jsp">Fuzzy Keyword Search</a></li>
                
              </ul>
            </li>
                      <li class="active current"><a href="filesearchgraph.jsp">Graph</a></li>
	<!-- 			<li class="active current"><a href="datausersearch.jsp">Search File</a></li> -->
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



<%-- <section class="container">
		<div class="row">
			<br>
			<div class="col-md-6">
			<center><h2 align="center" style="color:Blue;font-family:Cambria;font-size:25px;">View The File</h2></center>
			</div>
			<div class="col-md-2"></div>
			<div class="col-md-8"> 
			   <form method="get" action="Search">
                     
                <TABLE class="table table-bordered">
           				 <TR class="info">
           				  
               			 	<TH>File</TH>
               			 	   
           				 </TR>          				
         				
				 <% 
				 String id=request.getParameter("id");
    			 	System.out.print("id"+id);
						FileUploadDao dao=new FileUploadDao();
           					dao.makeConnection();
              			ResultSet rs=dao.newperticularlink(id);
						while(rs.next())
            			 {
        		%> 
           		<TR>
              		<TD align="center" style="color:black">  <%= rs.getString(1) %> </TD>
                		
 
 		 <TD  style="color:black"> <a href="viewperticularlink.jsp?id=<%= rs.getString(1) %>"> </TD>
 						 
             
               		<TD><a href="Search?firstname=<%= rs.getString(1)%>">Delete</a></td>
               		

      		  <%  }  %>
            
      			</TR>
         </TABLE>                                                                                               
                    
         </form> 	     
         </div>
		 <br>
	</div>
	
	

	
	
</section>
 --%>




	 <div class="container">
		<!--table -->
		
		<br><br>
			<div style="margin-top:10px;margin-bottom:50px;margin-left:100px;margin-right:150px">
				<h2 align="center" style="color:#990099;font-family:Cambria;font-size:25px;">Upload File Details</h2> 
			
			<br><br><br>
			<div class="col-md-8" >
			    <form method="post">
                     
                	
<div style="margin-top:0px;margin-bottom:0px;">
   <div style="width:660px; height:200px; overflow:auto;">
   <table cellspacing="20" cellpadding="10" border="5" width="660px" align="center" >
     <tr style="color:white;background-color:grey">
                            <TH>File:</TH>
               			 	
               			 	
               			 
               			 	
               			  <!--   <TH>Operataion</TH>  -->  
   
 </tr>

 <% 
				 String id=request.getParameter("id");
    			 	System.out.print("id"+id);
						FileUploadDao dao=new FileUploadDao();
           					dao.makeConnection();
              			ResultSet rs=dao.newperticularlink(id);
						while(rs.next())
            			 {
        		%> 
           		<TR>
              		<TD align="center" style="color:black">  <%= rs.getString(1) %> </TD>
                		
 
 		<%--  <TD  style="color:black"> <a href="viewperticularlink.jsp?id=<%= rs.getString(1) %>"> </TD>
 						  --%>
             
<%--                		<TD><a href="Search?firstname=<%= rs.getString(1)%>">Delete</a></td>
 --%>               		

      		  <%  }  %>
            
				
        
       </tr>
      
          
     </table>                                                                                  
           
                         
                    
         </form> 
         </div>
		 <br>
		 </div>
	</div>
	
	<br><br><br><br><br><br>	<br><br><br>	<br><br><br>	<br><br><br>	<br><br><br>


 <div class="single">
</div>















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