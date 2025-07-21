package com.example.data_structure.michael_session;

//minimum sum path
public class Demo4 {

    public static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] sum = new int[m][n];

        sum[0][0] = grid[0][0];

        for(int i=1;i<n;i++){
            sum[0][i] = sum[0][i-1] + grid[0][i];
        }

        for(int j=1;j<m;j++){
            sum[j][0] = sum[j-1][0] + grid[j][0];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                sum[i][j] = grid[i][j] + Math.min(sum[i][j-1],sum[i-1][j]);
            }
        }
        return sum[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] my2DArray = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int result = minPathSum(my2DArray);
        System.out.println(result);
    }
}
