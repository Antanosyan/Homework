package Homework0921Methods;

public class ArrayIncludesNumber {
    /*
    պիտի գրեք մեթոդ, որը կստանաս ամբողջ թվերի array ու ևս մեկ՝ array-ի
    տիպն ունեցող պարամետր։ Ձեր մեթոդը պետքա վերադարձնի true,
    եթե էդ թիվը պարունակվումա array-ի մեջ, ու false, եթե չի պարունակվում։*/
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,-7};
        int num = 7;
        System.out.println(arrIncludesNumber(arr,num));
    }
    static boolean arrIncludesNumber(int[] array,int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                return true;
            }
        }
        return false;
    }
}
