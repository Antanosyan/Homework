package homework_14_02;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;
    private int birthYear;

    public Student(int id, String name, int age, int grade, int birthYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public static List<Student> increaseStudentGrade(List<Student> students) {
        students.forEach(student -> student.setGrade(student.getGrade() * 1.15));
        return students;
    }

    public static String getGradeCategory(Student s) {
        if (s.getGrade() > 70) return "> 70";
        if (s.getGrade() >= 60 && s.getGrade() <= 70) return "60 - 70";
        return "< 60";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

