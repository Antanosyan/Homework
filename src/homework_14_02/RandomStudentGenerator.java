package homework_14_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudentGenerator {
    private static final String[] NAMES = {"Ani", "Hakob", "Aram", "David", "Eva", "Sona", "Gago", "Hayk", "Simon", "Samson"};
    private static final Random RANDOM = new Random();

    public static Student createRandomStudent() {
        int id = RANDOM.nextInt(100);
        String name = NAMES[RANDOM.nextInt(NAMES.length)];
        int age = 18 + RANDOM.nextInt(10);
        int grade = 10 + RANDOM.nextInt(91);
        int birthYear = 2025 - age;
        return new Student(id, name, age, grade, birthYear);
    }

    public static List<Student> createRandomStudents(int count) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            studentList.add(createRandomStudent());
        }
        return studentList;
    }
}
