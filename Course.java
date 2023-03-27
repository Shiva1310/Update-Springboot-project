package com.empdetail.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
private String coursename;
private String passout;
private String percentage;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "employee_id", nullable=false)
private Employee employee;

public Course() {
	super();
}

public Course( Long id,String coursename, String passout, String percentage,Employee employee) {
	super();
	this.id=id;
	this.coursename = coursename;
	this.passout = passout;
	this.percentage = percentage;
	this.employee=employee;
	
}




public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


public String getCoursename() {
	return coursename;
}

public void setCoursename(String coursename) {
	this.coursename = coursename;
}

public String getPassout() {
	return passout;
}

public void setPassout(String passout) {
	this.passout = passout;
}

public String getPercentage() {
	return percentage;
}

public void setPercentage(String percentage) {
	this.percentage = percentage;
}





}