package com.empdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empdetail.bean.Course;

public interface Courserepository extends JpaRepository<Course, Long>{

}
