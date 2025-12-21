package com.example.data_structure.binary_search;

public class BS_Leetcode_378 {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = countLessOrEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Count elements <= mid
    private static int countLessOrEqual(int[][] matrix, int mid) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;

        // Start from bottom-left
        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += (row + 1);
                col++;
            } else {
                row--;
            }
        }

        return count;
    }

    // =================== MAIN METHOD ===================
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k1 = 8;
        System.out.println("Kth smallest: " + kthSmallest(matrix1, k1));
        // Expected: 13

        int[][] matrix2 = {
                {1, 2},
                {1, 3}
        };
        int k2 = 2;
        System.out.println("Kth smallest: " + kthSmallest(matrix2, k2));
        // Expected: 1

        int[][] matrix3 = {
                {-5}
        };
        int k3 = 1;
        System.out.println("Kth smallest: " + kthSmallest(matrix3, k3));
        // Expected: -5
    }
}

