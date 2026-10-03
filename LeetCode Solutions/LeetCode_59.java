/*
 * LeetCode 59: Spiral Matrix II
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
 * Example 1:
 * Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 * Example 2:
 * Input: n = 1
 * Output: [[1]]
 */


public class LeetCode_59 {
public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int value = 1;

        while (left <= right && top <= bottom) {

            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        return matrix;
    }



    public static void main(String[] args) {
        LeetCode_59 solution = new LeetCode_59();
        int n = 3;
        int[][] result = solution.generateMatrix(n);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
