package main;

import java.util.*;

public class Calculator {
    double getAverageGrade(Student s){ // return double
        double average = 0;
        if(s.getCourses().isEmpty()) {return average;}

        for (Course c : s.getCourses()) {
            average += c.grade;
        }

            return average/s.getCourses().size();
    }
    double getMedianGrade(Student s){// return double
        if(s.getCourses().isEmpty()) {return 0.0;}

        ArrayList<Course> copy_courses = s.getCourses();
        copy_courses.sort((c1, c2) -> c2.grade - c1.grade);

        int z = s.getCourses().size();

        if(z%2 == 0){

            return (double)(copy_courses.get(z/2).grade + copy_courses.get(z/2 - 1).grade)/2;
        }
        else {
            return (double)copy_courses.get(z%2).grade;
        }
    }

}
