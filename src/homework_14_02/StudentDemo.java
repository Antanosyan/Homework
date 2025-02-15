package homework_14_02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> students = RandomStudentGenerator.createRandomStudents(20);
        System.out.println("Students grade from 60 to 80");
        students
                .stream()
                .filter(student -> (student.getAge() > 17 && student.getAge() < 21) && (student.getGrade() > 59 && student.getGrade() < 81))
                .map(Student::getName)
                .forEach(student -> System.out.println("Student : " + student));

        List<Student> increaseGradeStudents = Student
                .increaseStudentGrade(students)
                .stream()
                .filter(student -> student.getGrade() < 81)
                .sorted(Comparator.comparingInt(Student::getBirthYear)
                        .thenComparingDouble(Student::getGrade)
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getId))
                .toList();

        System.out.println("\nGrouped by birth year:");
        Map<Integer, Long> groupedByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getBirthYear, Collectors.counting()));
        groupedByYear.forEach((year, count) -> System.out.println("Year: " + year + " : " + count + " students"));

        System.out.println("Average grade for students aged 20 or older:");
        increaseGradeStudents
                .stream()
                .filter(s -> s.getAge() >= 20)
                .mapToDouble(Student::getGrade)
                .average()
                .ifPresent(average -> System.out.println("Average grade is " + average + "\n"));


        boolean allAbove45 = increaseGradeStudents
                .stream()
                .allMatch(s -> s.getGrade() > 45);
        System.out.println("Are all student's grades above 45? " + allAbove45 + "\n");

        System.out.println("Student with the lowest grade:");
        increaseGradeStudents
                .stream()
                .min((a, b) -> (int) (a.getGrade() - b.getGrade()))
                .ifPresent(s -> System.out.println(s.getName() + " with grade: " + s.getGrade()));
        System.out.println();

        System.out.println("Sorted student names:");
        String sortedByName = increaseGradeStudents
                .stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.joining(" , "));
        System.out.println(sortedByName);
        System.out.println();

        System.out.println("Students grade<60");
        increaseGradeStudents
                .stream()
                .filter(student -> student.getGrade() < 61)
                .forEach(System.out::println);
        System.out.println();

        Map<String, List<Student>> groupedByGrade = increaseGradeStudents
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeCategory));

        groupedByGrade.forEach((group, list) -> {
            System.out.println(group + ": " + list
                    .stream()
                    .map(Student::getName)
                    .collect(Collectors
                            .joining(", ")));
        });

        System.out.println();
        System.out.println("The youngest student is(are) : ");
        increaseGradeStudents
                .stream()
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(student -> System.out.println("Youngest student is " + student.getName()));
    }
}
