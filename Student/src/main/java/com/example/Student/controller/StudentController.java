package com.example.Student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.entity.Students;
import com.example.Student.service.StudentService;

@RestController
@RequestMapping("/student/v1")
public class StudentController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}



	@PostMapping("/addStudent")
	public Students addStudent(@RequestBody Students student)
	{
		Students savedStudent = studentService.addStudent(student);
		return savedStudent;
	}
	
	@GetMapping("/getStudent/{studentName}")
	public Students getStudentByName(@PathVariable("studentName") String name)
	{
		Students getStudent = studentService.getStudentByName(name);
		return getStudent;
	}
	
	@PutMapping("/updateStudent")
	public Students updateStudent(@RequestBody Students student)
	{
		Students updateStudent = studentService.updateStudent(student);
		return updateStudent;
	}
	
	@DeleteMapping("/deleteStudent/{rollNo}")
	public ResponseEntity<Students> deleteStudent(@PathVariable("rollNo") Integer rollNo)
	{
		studentService.deleteStudent(rollNo);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/getAllStudents")
	public List<Students> getAllStudents()
	{
		List<Students> getAllStudent = studentService.getAllStudent();
		return getAllStudent;
	}

	@GetMapping("/getStudent/{rollNo}")
	public Students getStudent(@PathVariable("rollNo") Integer rollNo)
	{
		Students getStudent = studentService.getStudent(rollNo);
		return getStudent;
	}

}
