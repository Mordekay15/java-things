package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Student {
    private String name;
    private String id;
    private ArrayList<Course> courses = new ArrayList<Course>();
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    String getId(){
        return this.id;
    }
    void addGrade(String course, int grade){
        Course c = new Course(course, grade);
        courses.add(c);
        //courses.sort((c1, c2) -> c2.grade - c1.grade);
    }
    ArrayList<Course> getCourses(){
        return this.courses;
    }
    void getGrades(){
        for (Course course : courses){
            System.out.println(course.name + ": " + course.grade);
        }

    }
}
