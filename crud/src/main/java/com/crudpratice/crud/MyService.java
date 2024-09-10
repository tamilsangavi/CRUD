package com.crudpratice.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	List<Student> li=new ArrayList<>();
    
	Student s=new Student("selvan","MCA",20);
	Student s1=new Student("hani","BCA",17);
Student s2=new Student("dhoshika","Maths",15);

	public List<Student> getStudent(){
	// List<Student> li=new ArrayList<>();
      
	//Student s=new Student("selvan","MCA",20);
	//Student s1=new Student("hani","BCA",17);
//Student s2=new Student("dhoshika","Maths",15);
li.add(s);
li.add(s1);
li.add(s2);
    return li;
}
	public String addStudent(Student i) {
	li.add(i);
	return "added successfully";
	}
	public String updateStudent(String name,String course) {
		for(Student i:li) {
			if(i.getName().equals(name)) {
				i.setCourse(course);
				return "updated";
			}
			//return "not updated";
		}
		return "not updated";
	}
		public String remove(String name) {
			for(Student i:li) {
				if(i.getName().equals(name)) {
					li.remove(i);
					return "deleted";
				}
			}
			return "not deleted";
		}
}
