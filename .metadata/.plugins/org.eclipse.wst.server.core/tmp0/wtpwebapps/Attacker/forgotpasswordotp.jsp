<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Attacker System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Bike Race Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!-- fonts -->

<link href="//fonts.googleapis.com/css?family=Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
<link href='css/aos.css' rel='stylesheet prefetch' type="text/css" media="all" />
<link href="css/jquery.mb.thumbgallery.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/info.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/banner.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="login/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css -->
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
			<a class="navbar-brand" href="index.jsp"><h1>Multi keyword</h1></a>
        </div>
      	
    </div>
</nav>




<div class="container">
				 <div id="loginbox" style="margin-top:150px;margin-bottom:150px;" class="mainbox col-md-4 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class = "panel panel-primary">
   						<div class = "panel-heading">
     						 <h3 class = "panel-title"align="center">Enter OTP Here</h3>
   						</div>
   							<div class = "panel-body">
       							 <form class="form-signin" name="login" action="UserRegistration" method="post">
                							<span id="reauth-email" class="reauth-email"></span>
                								<div class="form-group"><center>
                							OTP:	<input type="text"  name="otp"  style="width:200px;height:30px;"required /> 	</center>	                  
                 								</div>
              						
								               
                                               <!--  <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" name="submit" value="SignIn">Sign in</button>
      -->       				<!-- <center>	<input type="submit" name="submit" value="OTPForgotSubmit" > </center> -->
      
     <center>  <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" name="submit" style="width:120px;height: 40px;" value="OTPForgotSubmit"><b>Enter OTP</b></button> </center>
            
            </form>
            </div>
            </div>
            </div>
            </div>
            



<br><br><br><br><br><br><br><br><br><br><br>






<section class="last-w3layouts">
	<div class="container">
		<a href="index.html" class="bottom-agile"><h2 class="text-center">Attacker System</h2></a>
		<p class="text-center">Attack prevention and detection using Access Control Encrypted Cloud Storage </p>
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
<script src="js/jarallax.js"></script>
<script type="text/javascript">
    /* init Jarallax */
	$('.jarallax').jarallax({
        speed: 0.6,
        imgWidth: 1366,
        imgHeight: 768
    })
</script>
<script src='js/aos.js'></script>
<script src="js/aos2.js"></script>
<!-- js for recent pics section -->
<script src="js/jquery.mb.thumbGallery.js"></script>
<script>

    var isIframe = function() {
        var a = !1;
        try {
            self.location.href != top.location.href && ( a = !0 )
        } catch ( b ) {
            a = !0
        }
        return a
    };
    if ( !isIframe() ) {
        var logo = $( "<a href='#' style='position:absolute;top:0;z-index:1000'><img id='logo' border='0' src='#' alt='mb.ideas.repository'></a>" );
        $( "#wrapper" ).prepend( logo ), $( "#logo" ).fadeIn()
    }

    /* Extend or modify effects */
    jQuery.thumbGrid.transitions.fadeIn = {in: {x:"0", opacity:0, scale:0.9}, out: {x:0, opacity:0}};
    jQuery.thumbGrid.transitions.fadeOut = {in: {x:"0", opacity:0}, out: {x:0, scale:0.9, opacity:0}};
    jQuery.thumbGrid.transitions.slideLeft = {in: {x:$(window).width(), opacity:0}, out: {x:-$(window).width(), opacity:0}, ease:"cubic-bezier(.43,.18,.81,1.07)"};
    jQuery.thumbGrid.transitions.slideRight = {in: {x:0, opacity:0}, out: {x:$(window).width(), opacity:0}, ease:"cubic-bezier(.43,.18,.81,1.07)"};

    /* Initialize the gallery */
    jQuery("#thumbGrid").thumbGrid();

    /* customizer */
    jQuery("#effect").on("change",function(){
        var x = $(this).val();
        jQuery("#thumbGrid").data("nav_effect", x);
    });

    jQuery("#delay").on("change",function(){
        var x = parseFloat($(this).val());
        jQuery("#thumbGrid").data("nav_delay", x);
    });

    jQuery("#timing").on("change",function(){
        var x = parseFloat($(this).val());
        jQuery("#thumbGrid").data("nav_timing", x);
    });

    if(jQuery.isMobile){
        jQuery("body").css({marginBottom: 140})
    }


</script>
<!-- /js for recent pics section -->
<!-- js for testimonials -->
<script src="js/responsiveslides.min.js"></script>
<script>
    // You can also use "$(window).load(function() {"
    $(function () {

      // Slideshow 1
      $("#slider1").responsiveSlides({
        maxwidth: 800,
        speed: 800
      });
	});  
</script>
<!-- /js for testimonials -->
<!-- js for banner section -->
<script type="text/javascript" src="js/jquery.ba-cond.min.js"></script>
<script type="text/javascript" src="js/jquery.slitslider.js"></script>
<script type="text/javascript">	
			$(function() {
			
				var Page = (function() {

					var $nav = $( '#nav-dots > span' ),
						slitslider = $( '#slider' ).slitslider( {
							onBeforeChange : function( slide, pos ) {

								$nav.removeClass( 'nav-dot-current' );
								$nav.eq( pos ).addClass( 'nav-dot-current' );

							}
						} ),

						init = function() {

							initEvents();
							
						},
						initEvents = function() {

							$nav.each( function( i ) {
							
								$( this ).on( 'click', function( event ) {
									
									var $dot = $( this );
									
									if( !slitslider.isActive() ) {

										$nav.removeClass( 'nav-dot-current' );
										$dot.addClass( 'nav-dot-current' );
									
									}
									
									slitslider.jump( i + 1 );
									return false;
								
								} );
								
							} );

						};

						return { init : init };

				})();

				Page.init();

				/**
				 * Notes: 
				 * 
				 * example how to add items:
				 */

				/*
				
				var $items  = $('<div class="sl-slide sl-slide-color-2" data-orientation="horizontal" data-slice1-rotation="-5" data-slice2-rotation="10" data-slice1-scale="2" data-slice2-scale="1"><div class="sl-slide-inner bg-1"><div class="sl-deco" data-icon="t"></div><h2>some text</h2><blockquote><p>bla bla</p><cite>Margi Clarke</cite></blockquote></div></div>');
				
				// call the plugin's add method
				ss.add($items);

				*/
			
			});
</script>
<!-- /js for banner section -->
</body>
</html>