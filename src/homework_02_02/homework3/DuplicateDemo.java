package homework_02_02.homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3));
        int result = DuplicateCounter.duplicateCounter(list);
        System.out.println(result);
    }
}
