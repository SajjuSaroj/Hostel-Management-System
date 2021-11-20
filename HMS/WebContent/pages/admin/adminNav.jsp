<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	<a class="navbar-brand" href="/HMS/index.jsp">HMS</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarsExampleDefault"
		aria-controls="navbarsExampleDefault" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>


	<div class="collapse navbar-collapse" id="navbarsExampleDefault">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="/HMS/pages/admin/home.jsp">HOME    <span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="/HMS/pages/admin/RoomAdd.jsp">ADD ROOM INFO  </a></li>
			
			<li class="nav-item active"><a class="nav-link"
				href="/HMS/pages/admin/studentDetails.jsp">STUDENT DETAILS  </a></li>
			<li class="nav-item active"><a class="nav-link"
				href="/HMS/pages/admin/WardenDetails.jsp">WARDEN DETAILS  </a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
		<span style="color: white;">Welcome ${sessionScope.user.userName }</span>	 &nbsp;
			<a class="btn btn-outline-success my-2 my-sm-0"href="/HMS/logout">LOGOUT</a>
		</form>
	</div>
</nav>