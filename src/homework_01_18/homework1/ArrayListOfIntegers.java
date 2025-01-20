package homework_01_18.homework1;

import java.util.ArrayList;
import java.util.Arrays;

/*Ունեք մի arraylist, որի մեջ խառը ռացիոնալ թվեր են լցված՝ ամբողջ կամ կոտորակային մասով։ Ձեր խնդիրնա,
պտտվել տվյալ arraylist-ի վրայով, առանձնացնել Integer-ներն ու ավելացնել նոր arraylist-ի մեջ */

public class ArrayListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>(Arrays.asList(2.5, 4, -9, 7.9, 9.8, 0));
        ArrayList<Number> numberList1 = new ArrayList<>(Arrays.asList(-5, 4.9, 42, -7.9, 7.8, 50));
        System.out.println(arrayListOfIntegers(numberList));
        System.out.println(arrayListOfIntegers(numberList1));
    }

    public static ArrayList<Integer> arrayListOfIntegers(ArrayList<Number> arrayList) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (Number el : arrayList) {
            // Check if the number is an integer
            if (el.floatValue() % 1 == 0) {
                integerList.add(el.intValue());
            }
        }
        return integerList;
    }
}
