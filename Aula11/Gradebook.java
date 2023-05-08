package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Gradebook {
    private Map<String, Student> students;

    public Gradebook() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }

    public void load(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String name = parts[0].trim();
                List<Double> grades = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    grades.add(Double.parseDouble(parts[i].trim()));
                }
                Student student = new Student(name, grades);
                students.put(name, student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }

    public double calculateAverageGrade(String name) {
        Student student = students.get(name);
        if (student == null) {
            return 0;
        }
        List<Double> grades = student.getGrades();
        IGradeCalculator calculator = new SimpleGradeCalculator();
        return calculator.calculateavg(grades);
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println("Name: " + student.getName() + ", Grades: " + student.getGrades());
        }
    }
}