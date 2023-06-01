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
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(15);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(15);
        assertArrayEquals(result, expected);
    }

    @Test
    public void SnailShellPatternTestMatrixSize50Test()
            throws InterruptedException, ExecutionException, TimeoutException {
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(50);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(50);
        assertArrayEquals(result, expected);
    }

    @Test
    public void SnailShellPatternTestMatrixSize100Test()
            throws InterruptedException, ExecutionException, TimeoutException {
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(100);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(100);
        assertArrayEquals(result, expected);
    }

    @Test
    public void SnailShellPatternTestMatrixSize500Test()
            throws InterruptedException, ExecutionException, TimeoutException {
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(500);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(500);
        assertArrayEquals(result, expected);
    }
    @Test
    public void SnailShellPatternTestMatrixSize1000Test()
            throws InterruptedException, ExecutionException, TimeoutException {
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(1000);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(1000);
        assertArrayEquals(result, expected);
    }

    @Test
    public void SnailShellPatternTestMatrixSize5000Test()
            throws InterruptedException, ExecutionException, TimeoutException {
        ForTesting ft = new ForTesting();
        int[][] matrix = ft.generateMatrix(5000);
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = ft.generateArray(5000);
        assertArrayEquals(result, expected);
    }



}