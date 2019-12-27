<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
	<h1>EMPLOYEE ID IS: ${employeeId}</h1>
	<h1>EMPLOYEE NAME IS: ${employeeName}</h1>
	<h1>EMPLOYEE DESIGNATION IS: ${designation}</h1>
	<h1>EMPLOYEE GENDER IS: ${gender}</h1>
	<h1 style="color: red;">EMPLOYEE DATA DELETED</h1>
	<button class="btn btn-danger" type="submit" onclick="location.href='/'">Home</button>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>