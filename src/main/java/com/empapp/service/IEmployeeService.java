package com.empapp.service;

import java.util.List;

import com.empapp.pojo.Employee;

//interface which can be extended by EmployeeService
public interface IEmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	Employee getOneEmp(int empId);
}