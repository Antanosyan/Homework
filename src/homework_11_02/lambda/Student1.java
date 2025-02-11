package homework_11_02.lambda;

import java.util.function.Function;

public class Student1 {
    private String name;
    private int age;
    private double grade;
    private String birthYear;

    public Student1(String name, double grade, String birthYear) {
        this.name = name;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    private static Function<String, Integer> birthYearToAge = Integer::parseInt;

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
