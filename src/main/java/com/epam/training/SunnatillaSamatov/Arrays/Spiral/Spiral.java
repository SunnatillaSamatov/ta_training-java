package com.epam.training.SunnatillaSamatov.Arrays.Spiral;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new  int[rows][columns];

        int value = 1;

        int rowIndex = 0, columnIndex = 0;

        while (rowIndex < rows && columnIndex < columns) {

            for (int i = columnIndex; i < columns; ++i) {
                matrix[rowIndex][i] = value++;
            }
            rowIndex++;


            for (int i = rowIndex; i < rows; ++i) {
                matrix[i][columns - 1] = value++;
            }
            columns--;


            if (rowIndex < rows) {
                for (int i = columns - 1; i >= columnIndex; --i) {
                    matrix[rows - 1][i] = value++;
                }
                rows--;
            }


            if (columnIndex < columns) {
                for (int i = rows - 1; i >= rowIndex; --i) {
                    matrix[i][columnIndex] = value++;
                }
                columnIndex++;
            }
        }
        return matrix;
    }

}
