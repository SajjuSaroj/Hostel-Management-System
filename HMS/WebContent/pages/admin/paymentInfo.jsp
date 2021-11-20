<!DOCTYPE html>
<!-- saved from url=(0053)https://getbootstrap.com/docs/4.5/examples/jumbotron/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>Payment|Information</title>



<!-- Bootstrap core CSS -->
<link href="/HMS/css/bootstrap.min.css" rel="stylesheet">


<meta name="theme-color" content="#563d7c">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="/HMS/css/sticky-footer-navbar.css" rel="stylesheet">
<link href="/HMS/css/jumbotron.css" rel="stylesheet">
</head>
<body>

	<jsp:include page="/pages/admin/adminNav.jsp" />

	<br>
	<br>

	<main role="main" style="padding-top: 50px;">


		<div class="container">
		
		<img src="3.jpg" style= "width:400;height:150;margin-top:-100px;">
			<div align="center">
				<h3 style="text-align: center;margin-top:-130px;margin-left:180px;color:red;font-size:38px;
				text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">FEES PAYMENT INFORMATION OF STUDENTS</h3>
				<hr style="width:900px; margin-left:150px;margin-top:3px;border-width:8px;color:red;background-color:red">
		
		<br/>
		</div>
			<form action="/HMS/paymentInfoServlet" method="get">

			
			
		</form>
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