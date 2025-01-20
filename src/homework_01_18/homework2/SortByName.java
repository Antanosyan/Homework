package homework_01_18.homework2;

import java.util.Comparator;

public class SortByName implements Comparator<StudentGrades> {

    @Override
    public int compare(StudentGrades o1, StudentGrades o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
