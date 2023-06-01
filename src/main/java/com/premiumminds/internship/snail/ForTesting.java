package com.premiumminds.internship.snail;

/**
 * Class created for testing
 * @author Bruno Liu
 */
public class ForTesting {

    /**
     * Method that creates a square matrix for testing
     *
     * @param n the size of the square matrix
     * @return A square matrix, a spiral of numbers that ascend 1 by 1 clockwise.
     */
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    /**
     * Method that creates an array for testing
     *
     * @param n the size of the square matrix
     * @return An array of size n*n, the numbers in the array ascend 1 by 1
     */
    public int[] generateArray(int n) {
        int[] result = new int[n*n];
        for (int i = 0; i < n*n; i++) {
            result[i] = i+1;
        }
        return result;
    }
}
