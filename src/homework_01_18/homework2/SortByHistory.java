package homework_01_18.homework2;

import java.util.Comparator;

public class SortByHistory implements Comparator<StudentGrades> {

    @Override
    public int compare(StudentGrades o1, StudentGrades o2) {
        return Integer.compare(o1.getHistoryKnowledge(), o2.getHistoryKnowledge());
    }
}
