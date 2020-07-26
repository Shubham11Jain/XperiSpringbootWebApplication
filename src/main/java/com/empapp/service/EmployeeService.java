package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.dao.EmployeeDAO;
import com.empapp.pojo.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeDAO daoRef;
	
	@Override
	public List<Employee> getAllEmployee() {
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return daoRef.getOne(empId);
	}

	@Override
	public void addEmployee(Employee employee) {		
		daoRef.save(employee);
	}

	@Override
	public Employee getOneEmp(int empId) {
		// TODO Auto-generated method stub
		return daoRef.findByEmpId(empId);
	}
}
