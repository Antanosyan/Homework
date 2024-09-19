package Loops2;

public class MinMaxElement {
    public static void main(String[] args) {
        //Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք
        // տվյալ զանգվածի միջի մինիմում ու մաքսիմում թվերը։
        int[] arr = {0, 1, 7, 87, 5, 7, -98, 0, 18};
        if (arr.length < 2) {
            System.exit(1);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
