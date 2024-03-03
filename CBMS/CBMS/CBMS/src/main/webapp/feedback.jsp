<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>FeedBack</title>
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
	/* border: 2px solid red; */
	text-align: center;
	padding-top: 50px;
}

h1 {
	font-size: x-large;
	margin-bottom: 5px;
}

table {
	display: flex;
	justify-content: center;
	align-items: center;
}

textarea {
	margin-bottom: 20px;
	padding: 10px;
}

button {
	margin: 10px;
	padding: 10px;
}
</style>
</head>
<body>
	<div class="maincontainer">
		<form action="feedback" method="post" target="_self" autocomplete="off">
			<table>
				<tr>
					<label for="fb"><h1>FeedBack</h1></label>
				</tr>
				<tr>
					<td><textarea name="fb" id="fb" cols="30" rows="10"
							placeholder="Type Your Opinion/FeedBack"></textarea></td>
				</tr>
				<tr>
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

