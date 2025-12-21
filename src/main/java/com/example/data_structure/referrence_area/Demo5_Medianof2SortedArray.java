package com.example.data_structure.referrence_area;

import java.util.Arrays;

public class Demo5_Medianof2SortedArray
{
    public static double getMedianofSortedArray(int[] nums){
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));

        for(int n:nums){
            System.out.print(n+" ");
        }

        int arrLength = nums.length;
        double median=0;
        if(arrLength%2==0){
            median = (nums[arrLength/2-1]+ nums[arrLength/2])/2.0;
        } else{
            median = nums[arrLength/2];
        }
        return median;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{-5,3,6,12,15};
        int[] nums2 = new int[]{-12,-10,-6,-3,4,10};

        int totalLength = nums1.length+nums2.length;

        int[] nums = new int[totalLength];

        for(int i=0;i<nums1.length;i++){
            nums[i] = nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            nums[nums1.length+i] = nums2[i];
        }

        System.out.println("median: "+getMedianofSortedArray(nums));;
    }
}
