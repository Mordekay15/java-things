package p;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course Information:");
        Course course = new Course("Programming 101", 30);
        System.out.println("Name: " + course.getCourseName());
        System.out.println("Maximum students: " + course.getMaxStudents());

        System.out.println("\nStudent Information:");
        Student s1 = new Student("John Smith", "S001");
        Student s2 = new Student("Alice Johnson", "S002");
        System.out.println("Student 1 - Name: " + s1.getName() + ", ID: " + s1.getStudentId());
        System.out.println("Student 2 - Name: " + s2.getName() + ", ID: " + s2.getStudentId());

    }
}