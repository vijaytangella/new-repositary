<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Main Page</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
	font-size: large;
	font-weight: bolder;
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

.maincontainer {
	height: 100vh;
	width: 100%;
	background-color: bisque;
}

a {
	text-decoration: none;
	color: black;
	font-size: x-large;
}

.menu {
	height: 100px;
	width: 100%;
	border: 2px solid green;
	display: flex;
	justify-content: space-evenly;
	align-items: center;
}

.welcomemsg {
	height: 50px;
	width: 100%;
	text-align: center;
	margin-top: 20px;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<div class="maincontainer">
		<div class="logocontainer">
			<h1 class="logo">Logo</h1>
		</div>
		<div class="welcomemsg">
			<h1>Welcome to CBMS</h1>
			<h2>Who are you?</h2>
		</div>
		<div class="menu">
			<h1>
				<a href="adminsignup.jsp">Admin</a>
			</h1>
			<h1>
				<a href="staffsignup.jsp">Staff</a>
			</h1>
			<h1>
				<a href="custsignup.jsp">Customer</a>
			</h1>
		</div>
	</div>
</body>
</html>
