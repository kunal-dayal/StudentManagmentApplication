package com.example.studentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    HashMap<Integer,Student> db = new HashMap<>();

    //add
    public String addStudent(Student student){
        int id = student.getAdmnNo();
        db.put(id,student);
        return "succesfully added";
    }

    //update
    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return "invalid student id";
        }
        db.get(id).setAge(age);
        return "student udated";
    }

    //delete
    public String deleteStudent(int id){
        db.remove(id);
        return "id deleted";
    }

    //get
    public Student getStudent(int id){
        return db.get(id);
    }
}
