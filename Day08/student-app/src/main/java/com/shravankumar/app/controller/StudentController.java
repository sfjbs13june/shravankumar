package com.shravankumar.app.controller;

import com.shravankumar.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> getStudent(){
        List listStudent= new ArrayList();
        Student student1= new Student("student1","roll1","std1","schoolname1");
        Student student2= new Student("student2","roll2","std2","schoolname2");
        Student student3= new Student("student3","roll3","std3","schoolname3");
        
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
       
        return  listStudent;
    }

    @GetMapping("/map/students")
    public Map mapStudents(){
        Map studentMap= new HashMap();
        Student student1= new Student("student1","roll1","std1","schoolname1");
        Student student2= new Student("student2","roll2","std2","schoolname2");
        Student student3= new Student("student3","roll3","std3","schoolname3");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        return  studentMap;
    }
}

