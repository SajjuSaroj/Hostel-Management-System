<!DOCTYPE html>
<%@page session="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>HMS | Login</title>

<style type="text/css">
#login {
	width: 60%;
}

fieldset {
	border: 3px solid black;
	width: 60%;
	height: 40% px;
	margin: 80px;
}

h3 {
	margin-top: -0.9em;
	margin-left: 15px;
	background-color: white;
	display: block;
	width: 100px;
}

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


<link href="/HMS/css/jumbotron.css" rel="stylesheet">
<link href="/HMS/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


	<fieldset>
		<div>
			<h3>Login</h3>
		</div>

		<div class="container" id="login">
			<form class="form" action="/HMS/login" method="post">
				<div class="form-group">
					<label for="logintype">Login_Type</label> <select name="loginType"
						class="form-control">


						<option value="-1" selected>Select..</option>
						<option value="Warden">Warden</option>

						<option value="Admin">Admin</option>
					</select>
				</div>

				<div class="form-group">
					<label for="password"> User Name</label> <input type="text"
						class="form-control" id="userName" placeholder="Enter username"
						name="userName" required>
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" placeholder="Enter password"
						name="password" required>
				</div>

				<input type="submit" value="Login" class="btn btn-primary">

				<div class="text-center p-t-12">
					<span class="txt1"> Forgot </span> <a class="txt2"
						href="/HMS/pages/forget.html"> UserName/Password? </a>
				</div>
				<h6 style="color: red">New Warden Registration Here:</h6>
				<div class="text-center p-t-136">
					<a class="txt2" href="/HMS/pages/warden/registration.jsp">
						CLick here for Registration </a>
				</div>
		</div>

		</div>
		</form>
	
	</fieldset>



</body>
</html>