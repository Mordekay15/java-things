package main;

import java.util.ArrayList;

public class University {
    ArrayList<Student> students = new ArrayList<>();
    University(){}

    void addStudent(Student s){
        students.add(s);
    }
    void printStudents(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(i + ": " + students.get(i).getId() + ": " + students.get(i).getName());
        }
    }
    Student getStudent(int i){
        return students.get(i);
    }
    ArrayList<Student> getStudents(){
        return students;
    }
}
