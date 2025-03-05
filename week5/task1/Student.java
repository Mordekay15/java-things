package p;

public class Student {
    private String name;
    private String studentId;
    Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
    }
    String getName(){
        return this.name;
    }
    String getStudentId(){
        return this.studentId;
    }

}
