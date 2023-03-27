package com.empdetail.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empdetail.bean.Employee;
import com.empdetail.repository.Employeerepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Employeeservice {
	@Autowired
	public Employeerepository employeerepo;
	 

 public List<Employee> getAllEmployees(){
	 return employeerepo.findAll();
	 
 }
 public Employee getEmployeeById(Long id) {
	 return employeerepo.findById(id).orElse(null);
 }
 public Employee createEmployee(Employee employees){
	 return employeerepo.save(employees);
}
 public Employee updateEmployee(Long id,Employee employees)  {
Employee existingEmployee=employeerepo.findById(id).orElse(null);
if(existingEmployee!=null) {
	existingEmployee.setName(employees.getName());
	existingEmployee.setEmail(employees.getEmail());
	existingEmployee.setCourses(employees.getCourses());
	return employeerepo.save(existingEmployee);
} else 
	
	return null;
}
 public void deleteEmployee(Long id) {
	 employeerepo.deleteById(id);
 }
}
