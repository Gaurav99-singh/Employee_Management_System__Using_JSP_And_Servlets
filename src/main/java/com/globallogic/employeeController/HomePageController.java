package com.globallogic.employeeController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.beans.Employee;
import com.globallogic.queries.Query;

/**
 * Servlet implementation class HomePageController
 */
public class HomePageController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("Username : " + name);
		System.out.println("Password : " + password);
		if (name.equalsIgnoreCase("Gaurav") && password.equalsIgnoreCase("Gaurav")) {
			List<Employee> employees = new Query().selectAllEmployee();
			System.out.println(employees);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
			request.setAttribute("listemployee", employees);
			dispatcher.forward(request, response);
			
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
			dispatcher.forward(request, response);
			System.out.println("Incorrect id/password");
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

	

}
