package com.example.data_structure.referrence_area;

public class Demo14_PowerofTen {

    public static boolean powerOfTen(int num){
        if(num<1){
            return false;
        }
        while(num%10==0){
            num= num/10;
        }

        return num==1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 10, 100, 50, 1000, 0, -10};
        for(int n:nums){
            System.out.println(powerOfTen(n));;
        }
    }
}
