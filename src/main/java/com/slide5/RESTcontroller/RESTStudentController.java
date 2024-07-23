package com.slide5.RESTcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slide5.DAO.StudentDAO;
import com.slide5.beans.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest")
public class RESTStudentController {
	
	@Autowired
	StudentDAO studentDao;
	
	@GetMapping(path = "/students")
	public List<Student> getAll() {
		return studentDao.findAll();
	}
	
	@GetMapping(path = "/students/{email}")
	public Student getByEmail(@PathVariable("email") String email) {
		return studentDao.findById(email).get();
	}
	
	@PostMapping(path = "/students")
	public Student post(@RequestBody Student stu) {
		studentDao.save(stu);
		return stu;
	}
	
	@PutMapping("/students/{email}")
	public Student put(@PathVariable("email") String email, @RequestBody Student stu) {
		return studentDao.save(stu);
	}
	
	@DeleteMapping("/students/{email}")
	public void delete(@PathVariable("email") String email) {
		studentDao.deleteById(email);
	}
	
	
	
}
