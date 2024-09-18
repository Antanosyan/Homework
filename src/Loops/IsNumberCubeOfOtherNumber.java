package Loops;

import java.util.Scanner;
//Ունեք ցանկացած ամբողջ թիվ, որը ներմուծում եք։ Ձեր խնդիրնա պարզել,
// թե արդյոք տվյալ թիվը հանդիսանումա մեկ այլ ամբողջ թվի խորանարդ։
public class IsNumberCubeOfOtherNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = scanner.nextInt();
        boolean isCube = false;
            if(number == 0 || number == 1 || number == -1){
                System.out.println(number);
            }
        for (int i = 2; i <= number/4; i++) {
            int div = number / i;
            if (div / i == i) {
                isCube = true;
                System.out.println(i);
            }
        }
        for (double i = number/4; i <= -2; i++) {
            double div = -number / i;
            if (div / i == -i) {
                isCube = true;
                System.out.println(i);
            }
        }
        if(!isCube){
            System.out.println("number is not a cube of any number");
        }
    }
}
