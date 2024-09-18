package HomeworkArray;

public class ArrayWithPositives {
    public static void main(String[] args) {

        double[] arr = new double[5];
        double[] negativeArr = new double[5];
        arr[0] = -1.5;
        arr[1] = 3.5;
        arr[2] = 6.7;
        arr[3] = -7.5;
        arr[4] = 1.0;
        negativeArr[4] = (arr[0] > -1) ? arr[0] : 0;
        negativeArr[3] = (arr[1] > -1) ? arr[1] : 0;
        negativeArr[2] = (arr[2] > -1) ? arr[2] : 0;
        negativeArr[1] = (arr[3] > -1) ? arr[3] : 0;
        negativeArr[0] = (arr[4] > -1) ? arr[4] : 0;
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
        System.out.println(negativeArr[0] + " " + negativeArr[1] + " " + negativeArr[2] + " " + negativeArr[3] + " " + negativeArr[4]);
    }
}

