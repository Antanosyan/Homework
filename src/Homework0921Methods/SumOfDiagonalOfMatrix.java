package Homework0921Methods;

public class SumOfDiagonalOfMatrix {
    /*Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։ Պետքա գրել ծրագիր, որը կհաշվի
    մատրիցայի անկյունագծերի վրայի թվերի գումարը։*/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, -7, 8, 9, 10},
                {11, 1, 13, 4, -5},
                {0, 1, 8, 19, 20},
                {1, 7, -9, 8, 7}
        };
        int sumOfDiagonal = sumOfDiagonalOfMatrix(matrix);
        System.out.println(sumOfDiagonal);
    }

    static int sumOfDiagonalOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
