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
 * Servlet implementation class DeleteEmployeeDetailsController
 */
public class DeleteEmployeeDetailsController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id  = request.getParameter("id");
		Query q = new Query();
		boolean flag = q.deleteDetails(id);
		if(flag == true) {
			List<Employee> employees = new Query().selectAllEmployee();
			System.out.println(employees);
			
			request.setAttribute("listemployee", employees);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
			
			dispatcher.forward(request, response);
		}
		else {
			System.out.println("No such id exists");
		}
		
	}

}
