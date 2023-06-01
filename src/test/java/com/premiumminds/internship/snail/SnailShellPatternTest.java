package com.premiumminds.internship.snail;

import static org.junit.Assert.assertArrayEquals;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aamado on 05-05-2023.
 */
@RunWith(JUnit4.class)
public class SnailShellPatternTest {

  /**
   * The corresponding implementations to test.
   *
   * If you want, you can make others :)
   *
   */
  public SnailShellPatternTest() {
  };

  @Test
  public void ScreenLockinPatternTestFirst3Length2Test()
      throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertArrayEquals(result, expected);
  }

  @Test
  public void SnailShellPatternTestMatrixSize0Test()
          throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = {{}};
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {};
    assertArrayEquals(result, expected);
  }

  @Test
  public void SnailShellPatternTestMatrixSize1Test()
          throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = {{1}};
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {1};
    assertArrayEquals(result, expected);
  }

  @Test
  public void SnailShellPatternTestMatrixSize4Test()
          throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
    };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    assertArrayEquals(result, expected);
  }

  @Test
  public void SnailShellPatternTestMatrixSize5Test()
          throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
    };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    assertArrayEquals(result, expected);
  }

  @Test
  public void SnailShellPatternTestMatrixSize15Test()
          throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
            {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 16},
            {55, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 70, 17},
            {54, 103, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 116, 71, 18},
            {53, 102, 143, 176, 177, 178, 179, 180, 181, 182, 183, 154, 117, 72, 19},
            {52, 101, 142, 175, 200, 201, 202, 203, 204, 205, 184, 155, 118, 73, 20},
            {51, 100, 141, 174, 199, 216, 217, 218, 219, 206, 185, 156, 119, 74, 21},
            {50, 99, 140, 173, 198, 215, 224, 225, 220, 207, 186, 157, 120, 75, 22},
            {49, 98, 139, 172, 197, 214, 223, 222, 221, 208, 187, 158, 121, 76, 23},
            {48, 97, 138, 171, 196, 213, 212, 211, 210, 209, 188, 159, 122, 77, 24},
            {47, 96, 137, 170, 195, 194, 193, 192, 191, 190, 189, 160, 123, 78, 25},
            {46, 95, 136, 169, 168, 167, 166, 165, 164, 163, 162, 161, 124, 79, 26},
            {45, 94, 135, 134, 133, 132, 131, 130, 129, 128, 127, 126, 125, 80, 27},
            {44, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 28},
            {43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29}
    };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
            16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
            91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105,
            106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135,
            136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150,
            151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165,
            166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180,
            181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195,
            196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210,
            211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225};
    assertArrayEquals(result, expected);
  }
}