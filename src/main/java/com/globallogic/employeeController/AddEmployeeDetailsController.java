package com.globallogic.employeeController;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.beans.Employee;
import com.globallogic.database.DbConnection;
import com.globallogic.queries.Query;

/**
 * Servlet implementation class AddEmployeeDetailsController
 */
public class AddEmployeeDetailsController extends HttpServlet {
	
	private Connection con;
	private PreparedStatement ps;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Going to Add employee details page");
		 //EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo, Email, Gender, HireDate, Salary
	String id = request.getParameter("id");
	String pass = request.getParameter("password");
	String type = request.getParameter("type");
	String fName =  request.getParameter("first");
	String lName =  request.getParameter("last");
	String address =  request.getParameter("address");
	String phone =  request.getParameter("phone");
	String email =  request.getParameter("email");
	String gender =  request.getParameter("gender");
	String date =  request.getParameter("hireDate");
	double salary = Double.parseDouble(request.getParameter("salary"));
	

	
	Employee e  = new Employee(id,pass,type,fName,lName,address,phone,email,gender,date,salary);
	Query q = new Query();
	q.addDetails(e);
	
	List<Employee> employees = new Query().selectAllEmployee();
	System.out.println(employees);
	
	request.setAttribute("listemployee", employees);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
	
	dispatcher.forward(request, response);
	

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    //EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo, Email, Gender, HireDate, Salary
//		System.out.println("POST METHOD INVOKED");
//	String id = request.getParameter("id");
//	String pass = request.getParameter("password");
//	String type = request.getParameter("type");
//	String fName =  request.getParameter("first");
//	String lName =  request.getParameter("last");
//	String address =  request.getParameter("address");
//	String phone =  request.getParameter("phone");
//	String email =  request.getParameter("email");
//	String gender =  request.getParameter("gender");
//	String date =  request.getParameter("hireDate");
//	double salary = Double.parseDouble(request.getParameter("salary"));
//	
//	System.out.println("Userid : "+id);
//	System.out.println("Password : "+pass);
//	System.out.println("Type : "+type);
//	System.out.println("FirstName : "+fName);
//	System.out.println("Last Name : "+lName);
//	System.out.println("Address : "+address);
//	System.out.println("Phone : "+phone);
//	System.out.println("Email : "+email);
//	System.out.println("Gender : "+gender);
//	System.out.println("Date : "+date);
//	System.out.println("Salary : "+salary);
//	
//	Employee e  = new Employee(id,pass,type,fName,lName,address,phone,email,gender,date,salary);
//	Query q = new Query();
//	q.addDetails(e);
//	
//	List<Employee> employees = new Query().selectAllEmployee();
//	System.out.println(employees);
//	
//	request.setAttribute("listemployee", employees);
//	RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
//	
//	dispatcher.forward(request, response);
	

	}

}
