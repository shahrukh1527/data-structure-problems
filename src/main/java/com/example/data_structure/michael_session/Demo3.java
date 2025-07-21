package com.example.data_structure.michael_session;

//unique path
public class Demo3 {
    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    grid[i][j] =1;
                } else{
                    grid[i][j] =grid[i][j-1]+grid[i-1][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        int paths = uniquePaths(3, 7);
        System.out.println(paths);
    }
}
