package Homework0921Methods;

public class AmountOfWords {
    /*Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով
    տեքստա գրած պրոբելներով։։ Դուք պիտի գրեք մեթոդ, որը կստանաս տվյալ String-ը
    որպես պարամետր ու կվերադարձնի String-ում բառերի քանակը։*/
    public static void main(String[] args) {
        String text = "Java is a   high level programming language";
        System.out.println(countOfWord(text));
    }

    static int countOfWord(String text) {
        int count = 0;
        boolean isLetter = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!isLetter) {
                    count++;
                    isLetter = true;
                }
            } else {
                isLetter = false;
            }
        }
        return count;
    }
}
