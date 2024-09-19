package Loops2;

public class LongestSequenceLength {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 7, 8, 9};
        int curentLength = 1;
        int[] arrCurrLength = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];
            if (difference > 0) {
                curentLength++;
                arrCurrLength[i] = curentLength - 1;
            } else {
                curentLength = 1;
            }
        }
        int max = arrCurrLength[0];
        for (int i = 0; i < arrCurrLength.length; ++i) {
            if (arrCurrLength[i] > max) {
                max = arrCurrLength[i];
            }
        }
        System.out.println(max);
    }
}
