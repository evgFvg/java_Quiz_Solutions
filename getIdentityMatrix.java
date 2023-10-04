import java.io.IOException;

public class FindIdentityMatrix {
    public static void main(String[] args) throws IOException {
        int[][] mat = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {2, 3, 4, 0},
                {3, 3, 3, 1}};

        System.out.println("1 == " + getIdentityMatrixSize(mat, 4));

        int[][] mat2 = {
                {2, 3, 4, 5},
                {3, 3, 3, 3},
                {6, 7, 1, 0},
                {2, 3, 0, 1}};

        System.out.println("2 == " + getIdentityMatrixSize(mat2, 4));

        int[][] mat3 = {
                {4, 3, 9, 0, 2},
                {1, 2, 3, 4, 5},
                {6, 3, 1, 0, 0},
                {7, 6, 0, 1, 0},
                {3, 2, 0, 0, 1}};

        System.out.println("3 == " + getIdentityMatrixSize(mat3, 5));

    }

    private static int getIdentityMatrixSize(int[][] matrix, int N) {
        int level = 0;
        int counter = 0;
        while(1 == matrix[N - 1][N - 1] && checkZeroes(matrix, N, level)) {
            ++counter;
            ++level;
            N -= 1;
        }

        return counter;
    }

    private static boolean checkZeroes(int[][] matrix, int N,  int level) {
        int rightZero = 0;
        int botZero = 0;
        while(level > 0 && 0 == rightZero && 0 == botZero) {
            rightZero = matrix[N - 1][N - 1 + level];
            botZero = matrix[N - 1 + level][N - 1];
            --level;
        }
        return level == 0;
    }
}
