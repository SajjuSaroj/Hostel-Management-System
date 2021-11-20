<!DOCTYPE html>
<!-- saved from url=(0053)https://getbootstrap.com/docs/4.5/examples/jumbotron/ -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>Home | Admin |Student_Details</title>



<!-- Bootstrap core CSS -->
<link href="/HMS/css/bootstrap.min.css" rel="stylesheet">
<link href="/HMS/css/sticky-footer-navbar.css" rel="stylesheet">

<meta name="theme-color" content="#563d7c">


</head>
<body>

	<jsp:include page="/pages/admin/adminNav.jsp" />
	<br>
	<br>

	<main role="main" style="padding-top: 50px;">



		<div class="container">




		<img src="3.jpg" style= "width:400;height:150;margin-top:-100px;">
			<div align="center">
				<h3 style="text-align: center;margin-top:-130px;margin-left:-60px;color:red;font-size:38px;
				text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">SEARCH FOR STUDENT DETAILS</h3>
				<hr style="width:650px; margin-left:150px;margin-top:3px;border-width:8px;color:red;background-color:red">
		
<br/>
</div>





			<div class="form-group">

				<form action="/HMS/StudentInfoServlet" method="get">

					<div class="form-group">
					<label for="name">Student Name</label> <input type="text"
						class="form-control" id="name" name="sname">
				</div>


					<input type="submit" value="Search" class="btn btn-primary">

                 


				</form>
			</div>
		</div>

	</main>

	<footer class="footer">
		<div class="container">
			<jsp:include page="/pages/warden/footer.html" />
		</div>
	</footer>

	<script src="/HMS/js/jquery-3.5.1.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="/docs/4.5/assets/js/vendor/jquery.slim.min.js"><\/script>')
	</script>
	<script src="/HMS/js/bootstrap.bundle.min.js"></script>

</body>
</html>