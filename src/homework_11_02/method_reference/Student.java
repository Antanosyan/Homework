package homework_11_02.method_reference;

import java.util.function.Function;

public class Student {
    private String name;
    private int age;
    private double grade;
    private String birthYear;

    public Student(String name, double grade, String birthYear) {
        this.name = name;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    private static Function<String, Integer> birthYearToAge = Integer::parseInt;

    public static void updateAge(Student student) {
        student.setAge(2025 - birthYearToAge.apply(student.getBirthYear()));
    }

    public static void increaseGrade(Student student) {
        student.setGrade(student.getGrade() * 1.10);
    }

    public static void checkGrade(Student student) {
        if (student.getGrade() > 90) {
            System.out.println(student.getName());
        }
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

    public String getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
