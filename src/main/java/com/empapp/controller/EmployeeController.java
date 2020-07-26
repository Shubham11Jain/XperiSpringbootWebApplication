package com.empapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.empapp.pojo.Employee;
import com.empapp.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeService serviceRef;
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("employee",new Employee());
		return "Homepage";
	}
	
	@RequestMapping("/addEmployeeDetails")
	public String addEmployeeDetails(@ModelAttribute("employee") @Validated Employee employee, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "Homepage";
		}
		else{			
			  Employee e = serviceRef.getOneEmp(employee.getEmpId());
			  System.out.println("Emp :: "+e);
			  if(e != null) {
			  System.out.println("Data already exist");
			  model.addAttribute("errMsg","ID already exist, please use different ID.");
			  return "Homepage"; } else {
			 
			serviceRef.addEmployee(employee);
			model.addAttribute("successMsg", "Data Inserted Successfully");
			return "SuccessPage";
			}
		}
	}
	
	@RequestMapping("/getAllEmployee")
	public String getEmployeeList(Model model) {
		List<Employee> empList = new ArrayList<Employee>();
		empList= serviceRef.getAllEmployee();
		model.addAttribute("employeeList",empList);
		return "employeeview";
	}
}
