package com.globallogic.employeeController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.beans.Employee;
import com.globallogic.queries.Query;

/**
 * Servlet implementation class EditEmployeeDirect
 */
public class EditEmployeeDirect extends HttpServlet {

	String id;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("COMING FROM Home.jsp with id  TO UPDATE PAGE");
		id  = request.getParameter("id1");
		System.out.println("id got from ENTER ID TO UPDATE PAGE"+id+" get Method");
		Query q = new Query();
		System.out.println("GOING TO QUERY CLASS->TO SELECT EMPLOYEE DETAILS BY ID WHICH GOT FROM ENTER ID TO UPDATE PAGE");
		Employee emp = q.selectEmployeeById(id);
		System.out.println(emp);
		RequestDispatcher rs = request.getRequestDispatcher("/edit.jsp");
		request.setAttribute("empId",emp.getEmployeeId());
		request.setAttribute("pass",emp.getPassword());
		request.setAttribute("type",emp.getEmployeeType());
		request.setAttribute("first",emp.getFirstName());
		request.setAttribute("last",emp.getLastName());
		request.setAttribute("address",emp.getAddress());
		request.setAttribute("phone",emp.getPhoneNo());
		request.setAttribute("email",emp.getEmail());
		request.setAttribute("gender",emp.getGender());
		request.setAttribute("hire",emp.getHireDate());
		request.setAttribute("sal",emp.getSalary());
		rs.forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello post method");
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
		

		System.out.println("id got from ENTER ID TO UPDATE PAGE"+id+" GEt Method");
		Employee e  = new Employee(id,pass,type,fName,lName,address,phone,email,gender,date,salary);
		Query q = new Query();
		q.updateDetails(e);
		
		List<Employee> employees = new Query().selectAllEmployee();
		System.out.println(employees);
		
		request.setAttribute("listemployee", employees);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		
		dispatcher.forward(request, response);

	}

}
