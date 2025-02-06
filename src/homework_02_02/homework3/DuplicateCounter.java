package homework_02_02.homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCounter {
    /*if there is no any null value,this solution
     public static int duplicateCounter(ArrayList<Integer> list) {
        return list.size() - new HashSet<>(list).size();
    }
*/

    //if integer can be null
    public static int duplicateCounter(ArrayList<Integer> list) {
        if (list == null) {
            return 0;
        }
        Set<Integer> integerSet = new HashSet<>();
        int duplicateCount = 0;

        for (Integer num : list) {
            if (num != null) {
                if (!integerSet.add(num)) {
                    duplicateCount++;
                }
            }
        }
        return duplicateCount;
    }
}
