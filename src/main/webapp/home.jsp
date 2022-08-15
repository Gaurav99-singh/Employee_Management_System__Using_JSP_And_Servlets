<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="java.util.*, com.globallogic.employeeController.*"%>
<%@page import="java.util.*, com.globallogic.beans.*"%>





<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>HOME PAGE</title>
</head>


<body>

	<c:forEach var="list" items="${listemployee}">
${list}
<br />
	</c:forEach>

	<div class="p-3 mb-2 bg-dark text-white">
		<div class="p-3 mb-2 bg-danger text-white">
			<h1>
				<center>EMPLOYEE MANAGEMENT SYSTEM</center>
			</h1>
		</div>
		<div class="p-3 mb-2 bg-secondary text-white">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<a class="navbar-brand" href="index.jsp">HOME</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">


						<li class="nav-item"><a class="nav-link"
							href="<%=request.getContextPath()%>/addemployeedetails.html">Create</a>
						</li>


						<li class="nav-item"><a class="nav-link"
							href="<%=request.getContextPath()%>/enterIdtoUpdate.html">Update</a>
						</li>

						<li class="nav-item"><a class="nav-link"
							href="<%=request.getContextPath()%>/deleteemployeedetailsbyId.html">Delete</a>
						</li>


					</ul>
					<form class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					</form>
				</div>
			</nav>
		</div>


		<div align="center">
			<h1>Employee List</h1>

			<table border="1" cellpadding="5">
				<tr>
					<th>EMPLOYEE ID</th>
					<th>EMPLOYEE TYPE</th>
					<th>FIRST NAME</th>
					<th>EMAIL</th>
					<th>ACTION</th>
				</tr>



				<%
				List<Employee> empl = (List<Employee>) request.getAttribute("listemployee");
				%>

				<%
				for (Employee ee : empl) {
				%>

				<tr>
					<td><%=ee.getEmployeeId()%></td>
					<td><%=ee.getEmployeeType()%></td>
					<td><%=ee.getFirstName()%></td>
					<td><%=ee.getEmail()%></td>
					<td>

						<form id="edit" method="get" action="EditEmployeeDirect">
							<a href="Edit?id1=<%=ee.getEmployeeId()%>"
								onclick="myEditFunction()"> Edit </a>
						</form>

<br>
						<form id="delete" method="get" action="DeleteEmployeeDirect">
							<a href="Delete?id2=<%=ee.getEmployeeId()%>"
								onclick="myDeleteFunction()"> Delete </a>
						</form>


					</td>

				</tr>

				<%
				}
				%>
			</table>

			<script>
				function myDeleteFunction() {
					document.getElementById("delete").submit();
				}
				function myEditFunction() {
					document.getElementById("edit").submit();
				}
			</script>
</body>
</html>