package com.empdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empdetail.bean.Employee;
import com.empdetail.service.Employeeservice;


@RestController
@RequestMapping("/employees")

public class Employeecontroller {
	@Autowired
	private Employeeservice employeeService;
	public Employeecontroller(Employeeservice employeeService) {
		super();
		this.employeeService=employeeService;
		}
	@GetMapping("")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable Long id) {
	return employeeService.getEmployeeById(id);
}
	@PostMapping("")
public Employee createEmployee(@RequestBody Employee employees) {
		return employeeService.createEmployee(employees);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employees) {
		return employeeService.updateEmployee(id,employees);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
}
