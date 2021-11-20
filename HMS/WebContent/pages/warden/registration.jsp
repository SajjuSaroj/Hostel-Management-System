<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warden Registration</title>

<link rel="stylesheet" href="/HMS/css/bootstrap.min.css">

<style type="text/css">
#regForm {
	width: 60%;
}
</style>

</head>
<body>
<fieldset>
	<div class="container" align="center">
		<h3>Warden Registration Form</h3>
	</div>

	<div class="container" id="regForm">



		<form class="form" action="/HMS/wardenRegister" method="post">

			<!-- Warden Account Details -->

			<div class="form-group">
				<label for="userName">User Name</label> <input type="text"
					class="form-control" id="userName" placeholder="Enter username"
					name="userName" required>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" placeholder="Enter password"
					name="password"pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number a
					nd one uppercase and lowercase letter, and at least 4 or more characters" required>
			</div>
			<div class="form-group">
				<label for="cpassword">Confirm Password</label> <input type="text"
					class="form-control" id="cpassword"
					placeholder="Enter confirm password" name="cpassword">
			</div>


			<!-- Warden Personal Details -->
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					class="form-control" id="firstName" placeholder="Enter first name"
					name="firstName" pattern="(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one uppercase and lowercase 
					letter, and at least 4 or more characters" required>
			</div>


			<div class="form-group">
				<label for="lastName">Last Name</label> <input type="text"
					class="form-control" id="lastName" placeholder="Enter last name"
					name="lastName" pattern="(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one uppercase and lowercase 
					letter, and at least 4 or more characters" required>
			</div>

			<div class="form-group">
				<label for="gender">Gender</label>

				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						class="form-check-input" name="gender">Male
					</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label class="form-check-label">
						<input type="radio" class="form-check-input" name="gender">Female
					</label>
				</div>

			</div>

			<div class="form-group">
				<label for="dob">DOB</label> <input type="date" class="form-control"
					id="dob" name="dob">
			</div>

			<!-- Warden Contact Details -->

			<div class="form-group">
				<label for="phone">Email</label> <input type="email"
					class="form-control" id="email" name="email">
			</div>

			<div class="form-group">
				<label for="phone">Phone No</label> <input type="number"
					class="form-control" id="phone" name="phone">
			</div>

			<div class="form-group">
				<label for="address">Address</label>
				<textarea rows="5" cols="25" name="address" id="address"
					class="form-control"></textarea>
			</div>

			<div class="form-group">
				<label for="pincode">PinCode</label> <input type="number"
					class="form-control" id="pincode" name="pincode">
			</div>

			<input type="submit" value="Register" class="btn btn-primary">
			<input type="reset" class="btn btn-warning">
<br/><br/>
		</form>

	</div>
</fieldset>
</body>
</html>