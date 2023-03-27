package com.empdetail.bean;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	@OneToMany(mappedBy="employee",fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
	

	private List<Course> courses=new ArrayList<>();
	
	
	public Employee() {
		super();
		
	}
public Employee(Long id, String name,  String email, List<Course> courses) {
		super();
		this.setId(id);
		this.name = name;
		this.courses=courses;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}


}
