package Loops;
//Ունեք double[] array. մեջը խառը դրական ու բացասական թվեր։
// Ձեր խնդիրը հետևյալումա` սկսում եք իտերացիան առաջին էլեմենտից
public class IndexJump {
    public static void main(String[] args) {
        double[] array = {2.3, -4.5, 0, 1.2, -3.6, 5.0, 3.1};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (array[i] == 0) {
                System.out.println("Encountered 0, exiting the loop.");
                break;  // break if element is 0
            } else if (array[i] < 0) {
                System.out.println("Negative number encountered, jumping 2 steps.");
                i += 1;  // negative->2 steps
            }
        }
        System.out.println("Sum of all passed elements: " + sum);
    }
}
