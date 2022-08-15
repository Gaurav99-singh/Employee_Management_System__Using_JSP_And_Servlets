<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT EMPLOYEE DETAILS</title>
</head>
<body>

<!-- EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo, Email, Gender, HireDate, Salary -->
<h1><center>EDIT EMPLOYEE DETAILS PAGE </center></h1>
<h2>

<form method="POST" action="Edit">

<label>Employee Id : </label><input type="text" name="id" value="<%= request.getAttribute("empId") %>" disabled>
<br><br>
<label>Password : </label><input type="text" name="password" value="<%= request.getAttribute("pass") %>">
<br><br>
<label>Employee Type : </label><input type="text" name="type" value="<%= request.getAttribute("type") %>">
<br><br>
<label>First Name : </label><input type="text" name="first" value="<%= request.getAttribute("first") %>">
<br><br>
<label>Last Name : </label><input type="text" name="last" value="<%= request.getAttribute("last") %>">
<br><br>
<label>Address : </label><input type="text" name="address" value="<%= request.getAttribute("address") %>">
<br><br>
<label>Phone No : </label><input type="text" name="phone" value="<%= request.getAttribute("phone") %>">
<br><br>
<label>Email : </label><input type="text" name="email" value="<%= request.getAttribute("email") %>">
<br><br>
<label>Gender : </label><input type="text" name="gender" value="<%= request.getAttribute("gender") %>">
<br><br>
<label>Hire Date : </label><input type="date" name="hireDate" value="<%= request.getAttribute("hire") %>">
<br><br>
<label>Salary : </label><input type="number" name="salary" value="<%= request.getAttribute("sal") %>">
<br><br>

<input type="submit" value="save">
</form>
</h2>
</body>
</html>

    