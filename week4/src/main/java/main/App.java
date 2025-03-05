package main;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University uni = new University();
        Calculator c = new Calculator();
        String filePath = "students.txt";

        while (true) {
            System.out.println("1) Add student, 2) List students, 3) Add course completion for student, 4) List course completions of student, 5) Calculate the average of course completions, 6) Calculate median of course completions, 7) Save students to file, 8) Load students from file, 0) End the program");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you for using the program.");
                    return;
                }
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("What is the name of the student?");
                    String name = scanner.nextLine();
                    System.out.println("What is the student number of the student?");
                    String id = scanner.nextLine();
                    Student stu = new Student(name, id);
                    uni.addStudent(stu);
                }
                case 2 -> {
                    uni.printStudents();
                }
                case 3 -> {
                    uni.printStudents();
                    System.out.println("Which student?");
                    int student_id = scanner.nextInt();
                    Student s = uni.getStudent(student_id);
                    scanner.nextLine();
                    System.out.println("What is the name of the course?");
                    String name_course = scanner.nextLine();
                    System.out.println("What is the grade of the course?");
                    int course_grade = scanner.nextInt();
                    s.addGrade(name_course, course_grade);
                }
                case 4 -> {
                    uni.printStudents();
                    System.out.println("Which student?");
                    int student_id = scanner.nextInt();
                    Student s = uni.getStudent(student_id);
                    s.getGrades();
                }
                case 5 -> {
                    uni.printStudents();
                    System.out.println("Which student?");
                    int student_id = scanner.nextInt();
                    Student s = uni.getStudent(student_id);
                    System.out.println("Average is " + c.getAverageGrade(s));
                }
                case 6 -> {
                    uni.printStudents();
                    System.out.println("Which student?");
                    int student_id = scanner.nextInt();
                    Student s = uni.getStudent(student_id);
                    System.out.println("Median is " + c.getMedianGrade(s));
                }
                case 7 -> {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                        for (Student s : uni.getStudents()) {
                            writer.write(s.getName() + "=" + s.getId());
                            writer.newLine();
                        }
                        System.out.println("Students saved to file.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                case 8 -> {
                    uni.getStudents().clear();
                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] words = line.split("=");
                            Student s = new Student(words[0], words[1]);
                            uni.students.add(s);
                        }
                        System.out.println("Students loaded from file.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                default -> System.out.println("Wrong input value");

            }
        }
    }
}
