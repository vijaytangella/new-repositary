<%@page import="CBMS.DTO.CustSignUpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customers</title>
</head>
<body>
	<form method="post">
		<%
		List<CustSignUpDTO> list = (List<CustSignUpDTO>) request.getAttribute("allcust");
		%>
		<%
		if (list != null) {
		%>
		<table border="1px">
			<tr>
				<th>User Name</th>
				<th>Password</th>
				<th>Phone</th>
				<th>Mail</th>
				<th>Gender</th>
				<th>Address</th>
			</tr>

			<%
			for (CustSignUpDTO f : list) {
			%>
			<tr>
				<td><%=f.getUserAdmin()%></td>
				<td><%=f.getConfirmPass()%></td>
				<td><%=f.getPhone()%></td>
				<td><%=f.getMail()%></td>
				<td><%=f.getGender()%></td>
				<td><%=f.getAddress()%></td>
			</tr>
		</table>
		<%
		}
		} else {
		%>
		<h1>No Data Found</h1>
		<%
		}
		%>

	</form>
</body>
</html>