package homework_01_18.homework2;

import java.util.Comparator;

public class SortByPhysics implements Comparator<StudentGrades> {

    @Override
    public int compare(StudentGrades o1, StudentGrades o2) {
        return Integer.compare(o1.getPhysicsKnowledge(), o2.getPhysicsKnowledge());
    }
}
