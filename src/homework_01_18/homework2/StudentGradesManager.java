package homework_01_18.homework2;

import homework_01_18.homework3.ContainElement;
import java.util.ArrayList;

public class StudentGradesManager {
    public static void main(String[] args) {

        ArrayList<StudentGrades> studentList = new ArrayList<>();
        StudentGrades student1 = new StudentGrades("Anna", 74, 84, 54);
        StudentGrades student2 = new StudentGrades("Ani", 87, 78, 50);
        StudentGrades student3 = new StudentGrades("Harut", 44, 74, 87);
        StudentGrades student4 = new StudentGrades("David", 96, 100, 3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        //Using containMethod
        System.out.println(ContainElement.containsElement(studentList, student4));

        System.out.println("unsorted arraylist: \n" + studentList);
        studentList.sort(new SortByName());
        System.out.println("sorted arraylist by name: \n" + studentList);
        studentList.sort(new SortByHistory());
        System.out.println("sorted arraylist by historyKnowledge: \n" + studentList);
        studentList.sort(new SortByMath());
        System.out.println("sorted arraylist by mathKnowledge: \n" + studentList);
        studentList.sort(new SortByPhysics());
        System.out.println("sorted arraylist by physicsKnowledge: \n" + studentList);
    }
}
