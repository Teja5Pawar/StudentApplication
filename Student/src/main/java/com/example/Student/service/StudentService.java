package com.example.Student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.entity.Students;
import com.example.Student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Students addStudent(Students student)
	{
		return studentRepository.save(student);
	}
	
	public Students getStudentByName(String name)
	{
		return studentRepository.findStudentByName(name);
	}
	
	public Students updateStudent(Students student)
	{
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Integer rollNo)
	{
		studentRepository.deleteById(rollNo);
	}

}
