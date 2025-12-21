package com.example.data_structure.binary_search;

public class BS_Leetcode_704
{
    public static int binarySearchArray(int[] nums,int target){
        int left =0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]<target){
                left =mid+1;
            } else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,6,7,9,10,12,13,15,16,19,20,23,24,27,28,31};
        int target =10;
        System.out.println(binarySearchArray(nums,target));
    }
}
