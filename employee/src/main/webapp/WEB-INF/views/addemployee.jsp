<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
function validation() {	
	var letter = /^[A-Za-z ]+$/;
	var number1=/^[0-9]+$/;	
	
	var eId = document.getElementById("employeeId").value;
	var eName = document.getElementById("employeeName").value;

	if ( eName.match(letter) && eId.match(number1)  ) {
	
		return true;
	} 
	
	else {
		alert("inavalid EMPLOYEE NAME or EMPLOYEE ID");
		return false;
	}
}
</script>

</head>
<body>

<form action="name" method="post" onsubmit="return validation()">

		EMPLOYEE ID: <input type="text" id="employeeId" name="employeeId"><br>
		EMPLOYEE NAME : <input type="text" id="employeeName" name="employeeName"><br>
		EMPLOYEE DESIGNATION: <select name="designation">
			<option value="C1">C1</option>
			<option value="C2">C2</option>
			<option value="C3">C3</option>
			<option value="C4">C4</option>
			<option value="C5">C5</option>
			<option value="C6">C6</option>
			<option value="C7">C7</option>
			<option value="C8">C8</option>
			<option value="C9">C9</option>
			<option value="C10">C10</option>
			<option value="COO">COO</option>
			<option value="CTO">CTO</option>
			<option value="CEO">CEO</option>
			<option value="FOUNDERS">FOUNDERS</option>
			</select><br> 
		EMPLOYEE GENDER: 
		<input type="radio"  name="gender" value="male">Male
		<input type="radio"  name="gender" value="female">Female
		<input type="radio"  name="gender" value="others">Others<br>
		<button type="submit" class="btn btn-primary">Submit</button>
		
		
		

	</form>

</body>
</html>