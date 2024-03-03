<%@page import="CBMS.DTO.FeedBackDTO"%>
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
		List<FeedBackDTO> list = (List<FeedBackDTO>) request.getAttribute("feedbacks");
		%>
		<%
		if (list != null) {
		%>
		<table border="1px">
			<tr>
				<th>ID</th>
				<%--<th>User Name</th>--%>
				<th>FeedBacks</th>
			</tr>

			<%
			for (FeedBackDTO f : list) {
			%>
			<tr>
				<td><%=f.getId()%></td>
				<%--<td><%=f.getUser_name()%></td>--%>
				<td><%=f.getFeedBack()%></td>
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