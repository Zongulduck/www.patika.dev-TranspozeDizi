import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin satır sayısını girin: ");
        int row = input.nextInt();

        System.out.print("Dizinin sütun sayısını girin: ");
        int column = input.nextInt();

        int[][] dizi = new int[row][column];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                dizi[i][j] = input.nextInt();
            }
        }

        System.out.println("DİZİ:");
        printMatrix(dizi);

        int[][] transposeMatrix = transpose(dizi);
        System.out.println("Dizinin Transpozisyonu:");
        printMatrix(transposeMatrix);
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        int[][] transposeMatrix = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
