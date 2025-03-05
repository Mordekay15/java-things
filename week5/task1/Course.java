package p;

public class Course {
    private String courseName;
    private int maxStudents;
    Course(String courseName, int maxStudents){
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }
    String getCourseName() {
        return courseName;
    }
    int getMaxStudents(){
        return maxStudents;
    }
}
