<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Staff LogIn</title>
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
	border: 2px solid black;
}

.welcomemsg {
	margin-top: 30px;
	text-align: center;
}

a {
	text-decoration: none;
	color: black;
}

table {
	display: flex;
	justify-content: center;
	padding-top: 5%;
}
</style>
</head>
<body>
	<div class="maincontainer">
		<div class="logocontainer">
			<h1 class="logo">Logo</h1>
		</div>
		<div class="welcomemsg">
			<h1>Please Login</h1>
		</div>
		<form action="stafflogin" method="post" target="_self"
			autocomplete="off">
			<table>
				<tr>
					<td><label for="un">Username: </label></td>
					<td><input type="text" id="un" name="un"
						placeholder="Username" /></td>
				</tr>
				<tr>
					<td><label for="pass">Password: </label></td>
					<td><input type="password" id="pass" name="pass"
						placeholder="Password" /></td>
				</tr>
				<tr>
					<td><label for="phno">Phone: </label></td>
					<td><input type="text" id="phno" name="phno"
						placeholder="Phone Number" /></td>
				</tr>
				<tr>
					<td>
						<button>Submit</button>
						<button>Cancel</button>
					</td>
				</tr>
				<tr>
					<td>Don't have an account?</td>
					<td>
						<Button>
							<a href="staffsignup.jsp">SignUp</a>
						</Button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
