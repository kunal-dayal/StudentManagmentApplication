package com.example.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentrepository;

    //add
    public String addStudent(Student student){
        return studentrepository.addStudent(student);
    }

    //update
    public String updateStudent(int id,int age){
        return studentrepository.updateStudent(id,age);
    }

    //delete
    public String deleteStudent(int id){
        return studentrepository.deleteStudent(id);
    }

    //get
    public Student getStudent(int id){
        return studentrepository.getStudent(id);
    }

}
