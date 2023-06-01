package com.premiumminds.internship.snail;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2023.
 */
class SnailShellPattern implements ISnailShellPattern {

  /**
   * Method to get snailshell pattern
   * 
   * @param matrix matrix of numbers to go through
   * @return order array of values thar represent a snail shell pattern
   */
  public Future<int[]> getSnailShell(int[][] matrix) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Future<int[]> future;
    future = executor.submit(() -> {
      try {
        return getSnailPattern(matrix);
      } catch (Exception e) {
        throw new Exception("error: " + e.getMessage());
      }
    });
    executor.shutdown();
    return future;
  }

  /**
   * Method that gets the snailshell pattern according to a specific square matrix
   *
   * @param matrix matrix of numbers to go through
   * @requires the matrix has to be a square matrix
   * @return order array of values thar represent a snail shell pattern
   */
  private int[] getSnailPattern(int[][] matrix) {

    //Check if it is an empty matrix
    int matrixSize = matrix.length;
    if (matrixSize == 1 && matrix[0].length == 0)
      return new int[]{};

    //Initialize the variables needed
    ArrayList<Integer> intList = new ArrayList<>();
    int top = 0;
    int bottom = matrixSize;
    int left = 0;
    int right = matrixSize;
    int maxIterations = matrixSize/2;

    while (maxIterations >= 0) {
      //Reading a certain line from left to right  (top side of the matrix)
      for (int i = left; i < right; i++) {
        intList.add(matrix[top][i]);
      }
      top++;

      //If the matrix is squared then the reading can only end after reading from left to right
      //or from right to left
      if (intList.size() == matrixSize * matrixSize) {
        break;
      }

      //Reading a certain line from top to bottom (right side of the matrix)
      for (int l = top; l < bottom; l++) {
        intList.add(matrix[l][right - 1]);
      }
      right--;

      //Reading a certain right to left line (bottom side of the matrix)
      for (int i = right - 1; i >= left; i--) {
        intList.add(matrix[bottom - 1][i]);
      }
      bottom--;

      //If the matrix is squared then the reading can only end after reading from left to right
      //or from right to left
      if (intList.size() == matrixSize * matrixSize) {
        break;
      }

      //Reading a certain line from bottom to top (left side of the matrix)
      for (int i = bottom - 1; i >= top; i--) {
        intList.add(matrix[i][left]);
      }
      left++;

      maxIterations--;
    }

    //Convert the ArrayList<Integer> to int[]
    return intList.stream().mapToInt(Integer::intValue).toArray();

  }
}
