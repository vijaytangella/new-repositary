<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Customer</title>
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
				<a href="custprofile">Profile</a>
			</h2>
			<h2>Vehicels</h2>
			<h2>Payments</h2>
			<h2>Reports</h2>
			<h2>
				<a href="referafriend.jsp">Refer A Friend</a>
			</h2>
			<h2>Offers</h2>
			<h2>
				<a href="feedback.jsp">Feedback</a>
			</h2>
			<h2>
				<a href="MainPage.jsp" style="color: red">LogOut</a>
			</h2>
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
