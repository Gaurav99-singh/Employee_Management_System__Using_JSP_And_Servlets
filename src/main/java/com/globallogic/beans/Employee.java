package com.globallogic.beans;

public class Employee {
	
	String employeeId,password, employeeType, firstName, lastName, address, phoneNo, email, gender, hireDate;
	double salary;
	
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + ", employeeType=" + employeeType
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNo="
				+ phoneNo + ", email=" + email + ", gender=" + gender + ", hireDate=" + hireDate + ", salary=" + salary
				+ "]";
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String employeeId, String password, String employeeType, String firstName, String lastName,
			String address, String phoneNo, String email, String gender, String hireDate, double salary) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.employeeType = employeeType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public Employee(String employeeType, String firstName, String email) {
		super();
		this.employeeType = employeeType;
		this.firstName = firstName;
		this.email = email;
	}

	public Employee(String employeeId, String employeeType, String firstName, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeType = employeeType;
		this.firstName = firstName;
		this.email = email;
	}
	
	
	

}
