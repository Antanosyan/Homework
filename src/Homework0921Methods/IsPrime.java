package Homework0921Methods;

public class IsPrime {
    /*Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր.
    հեշտության համար array-ը ուղիղ հայտարարեք ու ինիցալիզացրեք կոդի մեջ։
    Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի
    պարզ լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։ Յուրաքանչյուր անդամի
    պարզ լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " : " + isPrime(arr[i]));
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
