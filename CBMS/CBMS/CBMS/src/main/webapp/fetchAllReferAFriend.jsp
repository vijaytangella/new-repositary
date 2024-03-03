<%@page import="CBMS.DTO.ReferAFriendDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Feedbacks</title>
</head>
<body>
	<form method="post">
		<%
		List<ReferAFriendDTO> list = (List<ReferAFriendDTO>) request.getAttribute("raf");
		%>
		<%
		if (list != null) {
		%>
		<table border="1px">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Phone</th>
			</tr>

			<%
			for (ReferAFriendDTO f : list) {
			%>
			<tr>
				<td><%=f.getId()%></td>
				<td><%=f.getName()%></td>
				<td><%=f.getPhone()%></td>
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