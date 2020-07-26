package com.empapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empapp.pojo.Employee;

//this java class is the database class
@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	Employee findByEmpId(int empId);
}