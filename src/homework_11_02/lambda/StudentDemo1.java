package homework_11_02.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentDemo1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Mesrop", 88, "2000");
        Student1 student2 = new Student1("Voskan", 89, "2001");
        Student1 student3 = new Student1("Usta", 70, "1999");
        Student1 student4 = new Student1("Nahapet", 59, "1998");
        List<Student1> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        System.out.println("Printing student data:");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Printing student data with updated grade:");
        students.forEach(student -> student.setGrade(student.getGrade() * 1.1));
        students.forEach(student -> System.out.println(student));
        System.out.println();

        System.out.println("Printing students name whose grade is more than 90:");
        students.forEach(student -> {
            if (student.getGrade() > 90) {
                System.out.println(student.getName());
            }
        });
        System.out.println();

        Function<String, Integer> birthYearToAge = birthYear -> Integer.parseInt(birthYear);
        students.forEach(student -> student.setAge(2025 - birthYearToAge.apply(student.getBirthYear())));
        System.out.println("Printing ages based on birthYear:");
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getAge()));
    }
}
