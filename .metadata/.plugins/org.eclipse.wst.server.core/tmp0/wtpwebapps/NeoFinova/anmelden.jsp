<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NeoFinova</title>
</head>

<style>
body {
	front-family: Arial, sans-serif;
	backround-color: #f4f4f4;
}

.container {
	background: white;
	display: flex; 
    justify-content: center;
    align-items: center;
    width: 90%;
    max-width: 1200px; 
    margin: auto;
}

footer {
	background: linear-gradient(to left, #00BFFF, #00FF7F);
	color: blue;
	padding: 20px;
	border-radius: 10px;
	font-size: 15px;
	text-align: center;
	width: 100%; 
	position: absolute;
	bottom: 0;
	left: 0;
}
</style>
</head>
<body>

	<div class="container" align="center">
		<header>
			<img src="images/icon3.jpg" />
		</header>
		<form action="anmelden" method="post" class="anmelden-form">
			<div align="center">
				<table>
					<tr>
						<td>UserName:</td>
						<td><input type="text" name="username" required="required"></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="password" required="required"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Anmelden"></td>
					</tr>

				</table>
				<footer>neoFinova</footer>
			</div>


		</form>


	</div>

	<footer>The New Face of Finance </footer>

</body>
</html>