package com.globallogic.queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.globallogic.beans.Employee;
import com.globallogic.database.DbConnection;

public class Query {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public Query() {
		con = DbConnection.createConnection(); // establishing database connection
	}

	// adding employee details to database
	// EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo,
	// Email, Gender, HireDate, Salary
	public void addDetails(Employee e) {

		String str = e.getHireDate();
		Date date = Date.valueOf(str);

		String query = "Insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, e.getEmployeeId());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmployeeType());
			ps.setString(4, e.getFirstName());
			ps.setString(5, e.getLastName());
			ps.setString(6, e.getAddress());
			ps.setString(7, e.getPhoneNo());
			ps.setString(8, e.getEmail());
			ps.setString(9, e.getGender());
			ps.setDate(10, date);
			ps.setDouble(11, e.getSalary());

			int row_status = ps.executeUpdate();

			if (row_status > 0) {
				System.out.println("Data added successfully");
			}

		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
		} finally {
			if (ps != null)
				try {
					ps.close();
					DbConnection.closeConnection();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}



	public Employee selectEmployeeById(String id) {
		Employee e = null;
		
		String sel = "select * from employee where EmployeeId =?";
		try {
			ps = con.prepareStatement(sel);
			ps.setString(1,id);
			rs = ps.executeQuery();
			//EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo, Email, Gender, HireDate, Salary
			while(rs.next()) {
				e = new Employee(rs.getString("EmployeeId"),rs.getString("Password"),rs.getString("EmployeeType"),
						rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Address"),rs.getString("PhoneNo"),
						rs.getString("Email"),rs.getString("Gender"),rs.getString("HireDate"),rs.getDouble("Salary"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 finally {
				if (ps != null)
					try {
						ps.close();
						DbConnection.closeConnection();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		
	return e;
	}

	public List<Employee> selectAllEmployee() {

		List<Employee> empList = new ArrayList<Employee>();
		
		String str = "Select * from employee";
		try {
		ps  = con.prepareStatement(str);
		
		rs = ps.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				
				empList.add(new Employee(rs.getString("EmployeeId"),rs.getString("EmployeeType"),rs.getString("FirstName"),
						rs.getString("Email")));	
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			if (ps != null)
				try {
					ps.close();
					DbConnection.closeConnection();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		return empList;
	}
	
int status = 0;
	public boolean deleteDetails(String id) {

		String strDelete = "Delete from employee where EmployeeId=?";
		try {
			ps = con.prepareStatement(strDelete);
			ps.setString(1, id);
			status = ps.executeUpdate();
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
		} finally {
			if (ps != null)
				try {
					ps.close();
					DbConnection.closeConnection();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		if(status!=0) {
			System.out.println("Data deleted successfully");	
			return true;
		
		}
		else {
			return false;}
	}

	public boolean updateDetails(Employee e) {
		int status = 0;
		String str = e.getHireDate();
		Date date = Date.valueOf(str);
		
		System.out.println(e);
		String strUpdate = "Update employee set Password=?, EmployeeType=?, FirstName=?, LastName=?, Address=?, PhoneNo=?, Email=?, Gender=?, HireDate=?, Salary=? where EmployeeId = ?";

		try {
			ps = con.prepareStatement(strUpdate);

			ps.setString(1, e.getPassword());
			ps.setString(2, e.getEmployeeType());
			ps.setString(3, e.getFirstName());
			ps.setString(4, e.getLastName());
			ps.setString(5, e.getAddress());
			ps.setString(6, e.getPhoneNo());
			ps.setString(7, e.getEmail());
			ps.setString(8, e.getGender());
			ps.setDate(9 ,date);
			ps.setDouble(10, e.getSalary());
			ps.setString(11, e.getEmployeeId());
			
			System.out.println(e);

			int row_status = ps.executeUpdate();

			if (row_status > 0) {
				System.out.println(e);
				System.out.println("Data updated successfully");
				e=null;
				status = 1;
			}

		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
		} finally {
			if (ps != null)
				try {
					ps.close();
					DbConnection.closeConnection();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		if(status != 0) {
			System.out.println("Data updated successfully");	
			return true;
		
		}
		else {
			return false;}
	}

}
