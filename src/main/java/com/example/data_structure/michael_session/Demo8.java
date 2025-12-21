package com.example.data_structure.michael_session;

public class Demo8
{
    public static String longestSubSequence(String text1,String text2){
        int[][] dp = new int[text1.length()+1][text2.length()+1];

        for (int i=1;i<=text1.length();i++){
            for (int j=1;j<=text2.length();j++){
               if(text1.charAt(i-1) ==text2.charAt(j-1)){
                   dp[i][j] = 1 + dp[i-1][j-1];
               } else{
                   dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
               }
            }
        }
//        return dp[text1.length()][text2.length()]; //execute this line if the length is asked


// Backtrack to build the LCS string
        StringBuilder lcs = new StringBuilder();
        int i = text1.length(), j = text2.length();
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                lcs.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();

    }
    public static void main(String[] args) {
        System.out.println(longestSubSequence("abcdaf","acbcf"));
    }
}
