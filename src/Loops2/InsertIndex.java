package Loops2;

public class InsertIndex {
    public static void main(String[] args) {
//Ունեք խառը թվերով լցված զանգված։ Զանգվածի առաջին բացասական թվից
// հետո պետքա insert անեք նոր թիվ՝ տվյալ բացասական էլեմենտի ինդեքսը։

        int[] arr = {1, 2, -7, 8, 9, -7, 89, -1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        int[] newArr = new int[arr.length + count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            newArr[j++] = arr[i];
            if (arr[i] < 0) {
                newArr[j++] = i;
            }
        }
    }
}