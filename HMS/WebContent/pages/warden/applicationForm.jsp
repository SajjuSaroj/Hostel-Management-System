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
<title>Application Form | Warden</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/jumbotron/">

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
<link href="/HMS/css/jumbotron.css" rel="stylesheet">
</head>
<body>

	<jsp:include page="/pages/warden/nav.jsp" />



	<main role="main" style="padding-top: 100px;">


		<div class="container">

			<img src="3.jpg" style= "width:400;height:150;margin-top:-100px;">
			<div align="center">
				<h3 style="text-align: center;margin-top:-130px;margin-left:180px;color:red;font-size:38px;
				text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">APPLICATION FORM FOR AVAILABLE HOSTEL<h3>
				<hr style="width:900px; margin-left:150px;margin-top:3px;border-width:8px;color:red;background-color:red">
				
				

			</div>
		-	
			
			<form action="/HMS/applicationFormServlet" method="post">

				<div class="form-group">
					<label for="name">Name of Student</label> <input type="text"
						class="form-control" id="userName"
						placeholder="Enter student name" name="name">
				</div>

				<div class="form-group">
					<label for="gender">Gender</label>

					<div class="form-check">
						<label class="form-check-label"> <input type="radio"
							class="form-check-input" name="gender" value="male">Male
						</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label class="form-check-label">
							<input type="radio" class="form-check-input" name="gender" value="female">Female
						</label>
					</div>

				</div>

				<div class="form-group">
					<label for="dob">DOB</label> <input type="date"
						class="form-control" id="dob" name="dob">
				</div>

				<div class="form-group">
					<label for="phone">Email</label> <input type="email"
						class="form-control" id="email" name="email">
				</div>

				<div class="form-group">
					<label for="name">Course</label> <select name="course"
						class="form-control">

						<option value="-1" selected>select..</option>

						<option value="B.Tech">B.TECH</option>

						<option value="MCA">MCA</option>

						<option value="MBA">MBA</option>

						<option value="BCA">BCA</option>
					</select>
					
				</div>
				<div class="form-group">
					<label for="Year">Year</label> <input type="number"
						class="form-control" id="year" name="year">
				</div>


				<div class="form-group">
					<label for="name">Category</label> <select name="category"
						class="form-control">

						<option value="-1" selected>select..</option>

						<option value="General">General</option>

						<option value="OBC">OBC</option>

						<option value="SC">SC</option>

						<option value="ST">ST</option>
					</select>
				</div>



				<div class="form-group">
					<label for="address">Address</label>
					<textarea rows="2" cols="25" name="address" id="address"
						class="form-control"></textarea>
				</div>



				<div class="form-group">
					<label for="phone">Student Mobile NO</label> <input type="tel"
						class="form-control" id="phone" name="smobile">
				</div>

				

				<div class="form-group">
					<label for="address">Corresponding-Address</label>
					<textarea rows="2" cols="25" name="caddress" id="caddress"
						class="form-control"></textarea>
						
						

				</div>
				<div class="form-group">
					<label for="name">Father's Name</label> <input type="text"
						class="form-control" id="FatherName"
						placeholder="Enter Father name" name="fname">
				</div>

				<div class="form-group">
					<label for="phone"> Father Mobile No</label> <input type="tel"
						class="form-control" id="phone" name="fmobile">
				</div>




				<div class="form-group">
					<label for="localguardians">Address of local
						guardians</label> <input type="text" class="form-control" id="phone"
						name="localguardians">
				</div>




				<div class="form-group">
					<label for="relation">Relation of Student</label> <input
						type="text" class="form-control" id="firstName"
						name="lgname">
				</div>


			
				<div class="form-group">
					<label for="uploadphoto">Upload Your Photo</label> <input
						type="file" class="form-control" id="upload photo"
						name="photo">
				</div>

				<input type="submit" value="SUBMIT THIS FORM"
					class="btn btn-primary"> <input type="reset"
					class="btn btn-warning"> <input type="button" value="Print" class="btn btn-success" onclick="print()">

				<div class="form-group">
				<br/>
					<label for="txt">Note</label>
					<list type="ul">
					<li>Entry from hostel after 10:00 p.m. is strictly prohibited
						for Boys and 5:30 p.m. for resident of girl's hostel</li>
					<li>Based of the warden report on status of
						room/furniture/floor/in pre allotment form of next year will only
						be considered after depositing the fine imposed.</li>
						</list>
						</div>			
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