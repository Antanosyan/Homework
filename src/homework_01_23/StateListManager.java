package homework_01_23;

import java.util.LinkedList;
import java.util.List;

public class StateListManager {

    public static void main(String[] args) {
        List<State> stateList = new LinkedList<>();
        State Armenia = new State("Armenia", "Yerevan", "AM", "Mer Hayreniq", "Eagle and Lion", "Red Blue Orange", 3_000_000, 30_000);
        State Russia = new State("Russia", "Moscow", "RU", "National anthem of russia", "Golden two-headed eagle", "White Blue Red", 170_000_000, 17_100_000);
        State Iran = new State("Iran", "Tehran", "IRN", "Sorude Melliye Jomhuriye Eslāmiye Irān", "Four curves and a sword", "Green White Red", 80_000_000, 1_648_000);
        State Armenia1 = new State("Armenia1", "Yerevan", "AM", "Anthem of Armenia1", "Eagle", "Red Orange Blue", 3_000_000, 30_000);
        State Iraq = new State("Iraq", "Baghdad", "IRQ", "Sorude Melliye Jomhuriye Eslāmiye Irān", "Four curves and a sword", "Green White Red", 10_000_000, 648_000);

        stateList.add(Armenia);
        stateList.add(Armenia1);
        stateList.add(Iran);
        stateList.add(Iraq);
        stateList.add(Russia);
        stateList.add(Russia);

        System.out.println("Before removing duplicates  \n");

        for (State state : stateList) {
            System.out.println(state + " ");
        }
        System.out.println();
        List<State> stateListWithoutDuplicates = State.removeDuplicates(stateList);

        System.out.println("After removing duplicates  \n");

        for (State state : stateListWithoutDuplicates) {
            System.out.println(state + " ");
        }
    }
}
