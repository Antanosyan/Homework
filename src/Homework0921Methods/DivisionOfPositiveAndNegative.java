package Homework0921Methods;

public class DivisionOfPositiveAndNegative {
    /*Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա գտնել մեթոդին
    փոխանցված array-ում դրական ու բացասական թվերի հարաբերակցությունը`
     positive / negative, ու վերադարձնել տվյալ double թիվը։ Եթե չլինեն բացասական թվեր,
    թող վերադարձնի -1։*/
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 2, 5};
        System.out.println(division(arr));
    }

    static double division(int[] array) {
        int countOfPositive = 0;
        int countOfNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countOfPositive++;
            } else if (array[i] < 0) {
                countOfNegative++;
            }
        }
        if (countOfNegative == 0) {
            return -1;
        }
        return (double) countOfPositive / countOfNegative;
    }
}

