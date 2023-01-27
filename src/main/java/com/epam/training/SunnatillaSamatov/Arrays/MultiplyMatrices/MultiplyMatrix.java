package com.epam.training.SunnatillaSamatov.Arrays.MultiplyMatrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int rowLength1 = matrix1.length;
        int columnLength2 = matrix2[0].length;

        int[][] output = new int[rowLength1][columnLength2];
        for(int i=0;i<rowLength1;i++){
            for (int j = 0; j < columnLength2; j++) {

                    output[i][j]=sum(i,j,matrix1,matrix2);

            }
        }
        return output;
    }

    public static int sum(int row, int column, int[][] matrix1, int[][] matrix2){

        int columnLength = matrix1[0].length;
        int sum =0;
        for (int i = 0; i < columnLength; i++) {

            sum += matrix1[row][i]*matrix2[i][column];

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
