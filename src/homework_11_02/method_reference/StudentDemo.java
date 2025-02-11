package homework_11_02.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Mesrop", 88, "2000");
        Student student2 = new Student("Voskan", 89, "2001");
        Student student3 = new Student("Usta", 70, "1999");
        Student student4 = new Student("Nahapet", 59, "1998");
        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        System.out.println("Printing student data:");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Printing student data with updated grade:");
        students.forEach(Student::increaseGrade);
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Printing students name, grade more than 90:");
        students.forEach(Student::checkGrade);
        System.out.println();

        System.out.println("Printing ages based on birthYear:");
        students.forEach(Student::updateAge);
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getAge()));
    }
}
