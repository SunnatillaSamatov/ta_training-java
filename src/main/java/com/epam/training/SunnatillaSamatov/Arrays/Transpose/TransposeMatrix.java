package com.epam.training.SunnatillaSamatov.Arrays.Transpose;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[][] output = new int[columnLength][rowLength];
        for (int i = 0; i < columnLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                output[i][j]=matrix[j][i];
            }
        }

        return output;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
