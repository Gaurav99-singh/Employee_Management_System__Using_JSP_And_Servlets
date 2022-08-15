package com.globallogic.database;


import java.sql.*;

public class DbConnection
{
	private static Connection con;//Connection interface
	
	public static Connection createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//to load driver(Class belong lang package)
			
			//valid till jdk 1.6 only above line if remove then no error and also remove class not found exception
			//(forName->factory method->to create driver class object)
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","root");
			//Driver manager communicate with type 4 driver
		}
		catch(ClassNotFoundException cse)
		{
			cse.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection()
	{
		if(con!=null)
		{
			try
			{
				con.close();
			}
			catch(SQLException sed)
			{
				sed.printStackTrace();
			}
		}
	}
}