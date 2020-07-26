package com.empapp.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="EmployeeData")
public class Employee {

	@Id
	@NotNull(message="Employee Id can not be blank, and atleast 4 in length.")
	private int empId;
	@NotEmpty(message="Employee name can not be blank.")
	@Pattern(regexp="^[a-zA-Z_ ]*$", message="Only alphbets are allowed in Employee Name")
	private String empName;
	@NotEmpty(message="Job Type con not be blank.")
	@Pattern(regexp="^[a-zA-Z_ ]*$", message="Only alphbets are allowed in Job Type")
	private String jobType;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String jobType) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobType = jobType;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobType=" + jobType + "]";
	}
	
	
}
