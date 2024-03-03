<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Refer A Friend</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
	font-size: large;
	font-weight: bold;
}

.maincontainer {
	height: 500px;
	width: 100%;
	border: 2px solid red;
	text-align: center;
	padding-top: 50px;
}

h1 {
	font-size: x-large;
	margin-top: 100px;
	margin-bottom: 10px;
}

table {
	display: flex;
	justify-content: center;
	align-items: center;
}

button {
	margin: 10px;
	padding: 5px;
}
</style>
</head>
<body>
	<div class="maincontainer">
		<form action="referafriend" method="post" target="_self"
			autocomplete="off">
			<table>
				<tr>
					<label for="fb"><h1>Refer A Friend</h1></label>
				</tr>
				<tr>
					<td><label for="name">Name: </label></td>
					<td><input type="text" id="name" name="name"
						placeholder="Name" /></td>
				</tr>
				<tr>
					<td><label for="phno">Phone: </label></td>
					<td><input type="number" id="phno" name="phno"
						placeholder="Phone" /></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button>Submit</button>
						<button>Cancel</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
