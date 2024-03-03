<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Admin</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
}

.maincontainer {
	height: 100vh;
	width: 100%;
	background-color: bisque;
}

.logocontainer {
	height: 100px;
	width: 100%;
	border: 2px solid orange;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-bottom: 10px;
}

.logo {
	height: 100px;
	width: 100px;
	border: 2px solid blue;
	display: flex;
	justify-content: center;
	align-items: center;
}

a {
	text-decoration: none;
	color: black;
}

.mainnav {
	height: 100px;
	width: 100%;
	border: 2px solid blue;
	display: flex;
	justify-content: space-evenly;
	align-items: center;
	margin-bottom: 10px;
}

.subnav {
	height: 100px;
	width: 100%;
	border: 2px solid green;
	display: flex;
	justify-content: space-evenly;
	align-items: center;
}

.welcomemsg {
	font-weight: bold;
	font-size: x-large;
	text-align: center;
}
</style>
</head>
<body>
	<div class="maincontainer">
		<div class="logocontainer">
			<h1 class="logo">Logo</h1>
		</div>
		<nav class="mainnav">
			<h2>
				<a href="adminprofile">Profile</a>
			</h2>
			<h2>
				<a href="fetchAllStaff">Staff</a>
			</h2>
			<h2>Vehicles</h2>
			<h2>Rentals</h2>
			<h2>
				<a href="fetchAllCust">Customer</a>
			</h2>
			<h2>Packages</h2>
		</nav>
		<nav class="subnav">
			<h3>Tracking</h3>
			<h3>Report</h3>
			<h3>
				<a href="fetchraf">Referrals</a>
			</h3>
			<h3>
				<a href="fetchfeedback">Feedbacks</a>
			</h3>
			<h3>
				<a href="MainPage.jsp" style="color: red">LogOut</a>
			</h3>
		</nav>
		<div class="welcomemsg">
			<%
			String user = (String) request.getAttribute("un");
			%>
			Welcome
			<%=user%>
		</div>
	</div>
</body>
</html>
