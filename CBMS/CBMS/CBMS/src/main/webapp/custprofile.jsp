<%@page import="CBMS.DTO.CustSignUpDTO"%>
<%@page import="CBMS.DTO.AdminSignUpDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Admin Profile</title>
<link rel="stylesheet" href="profile.css" />
<style>
input {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	font-size: large;
	font-weight: 700;
}

textarea {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	font-size: medium;
	font-weight: 700;
}
</style>
</head>
<body>
	<h1>Profile</h1>
	<div class="container glass">
		<form action="" method="post" autocomplete="off">
			<%
			CustSignUpDTO data = (CustSignUpDTO) request.getAttribute("data");
			%>
			<table>
				<tr>
					<td><label for="un">User Name</label></td>
					<td><input type="text" id="un" name="un"
						value="<%=data.getUserAdmin()%>" /></td>
				</tr>
				<tr>
					<td><label for="pass">Password</label></td>
					<td><input type="text" id="pass" name="pass"
						value="<%=data.getConfirmPass()%>" /></td>
				</tr>
				<tr>
					<td><label for="phno">Phone</label></td>
					<td><input type="text" id="phno" name="phno"
						value="<%=data.getPhone()%>" /></td>
				</tr>
				<tr>
					<td><label for="mail">Email</label></td>
					<td><input type="text" id="mail" name="mail"
						value="<%=data.getMail()%>" /></td>
				</tr>
				<tr>
					<td><label for="gender">Gender</label></td>
					<td><input type="text" id="gender" name="gender"
						value="<%=data.getGender()%>" /></td>
				</tr>
				<tr>
					<td><label for="addr">Address</label></td>
					<td><textarea name="addr" id="addr" cols="21" rows="3"><%=data.getAddress()%></textarea>
					</td>
				</tr>
				<tr>
					<td>
						<button>Update</button>
					</td>
					<td>
						<button>Cancel</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
