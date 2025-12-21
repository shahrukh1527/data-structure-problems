package com.example.data_structure.referrence_area;

public class Demo21_SumOfFractions {

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int[] getSumOfFractions(int num1,int num2,int den1,int den2){
         int numerator = num1*den2 + num2*den1;
         int denominator = den1*den2;

         int gcdresult = gcd(numerator,denominator);

         int finalNum = numerator/gcdresult;
         int finalDen = denominator/gcdresult;

          return new int[]{finalNum,finalDen};
    }

    public static void main(String[] args) {
        int[] nums = getSumOfFractions(1,3,3,9);
        System.out.println(nums[0]+" / "+nums[1]);
    }
}
