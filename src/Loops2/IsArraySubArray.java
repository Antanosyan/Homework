package Loops2;

public class IsArraySubArray {
    //պետքա ստուգեք, թե արդյոք 2-րդ զանգվածը պարունակվումա առաջինի մեջ
// թե չէ ու տպեք համապատասխան հաղորդագրություն։
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4, 9, 0, 7, 5, 8, 9, 0, 7};
        int[] subArr = {9, 0, 7};
        boolean isSubArray = false;
        for (int i = 0; i < arr.length - subArr.length + 1; i++) {
            int j;
            for (j = 0; j < subArr.length; j++) {
                if (arr[i + j] != subArr[j]) {
                    break;
                }
            }
            if (j == subArr.length) {
                isSubArray = true;
                break;
            }
        }
        if (isSubArray) {
            System.out.println("is sub");
        } else {
            System.out.println("not sub");
        }
    }
}
