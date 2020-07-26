package com.empapp.service;

import java.util.List;

import com.empapp.pojo.Employee;


public interface IEmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	Employee getOneEmp(int empId);
}