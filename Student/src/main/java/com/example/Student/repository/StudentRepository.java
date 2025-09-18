package com.example.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer>{
	
	public Students findStudentByName(String name);

}
