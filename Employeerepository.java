package com.empdetail.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.empdetail.bean.Employee;

public interface Employeerepository extends JpaRepository<Employee, Long> {

	

}
