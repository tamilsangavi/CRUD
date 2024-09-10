package com.crudpratice.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	MyService service;
	@GetMapping("/stud")
	public List<Student>get()
	{
		return service.getStudent();
	}
	@PostMapping("/stud")
	public String add(@RequestBody Student i)
	{
		return service.addStudent(i);
	}
	@PutMapping("/stud")
	public String update(@RequestParam String name,String course)
	{
		return service.updateStudent(name,course);
	}
	@DeleteMapping("/stud/{name}")
	public String delete(@PathVariable String name) {
		return service.remove(name);
	}
}
