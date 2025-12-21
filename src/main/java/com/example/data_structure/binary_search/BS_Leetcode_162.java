package com.example.data_structure.binary_search;

public class BS_Leetcode_162 {

    public static int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Compare mid with mid+1
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1; // peak on right side
            } else {
                high = mid; // peak on left side or mid itself
            }
        }

        return low; // low == high -> peak index
    }

    // =================== MAIN METHOD ===================
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Peak index: " + findPeakElement(nums1));
        // Expected: 2

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak index: " + findPeakElement(nums2));
        // Expected: 1 or 5

        int[] nums3 = {1};
        System.out.println("Peak index: " + findPeakElement(nums3));
        // Expected: 0

        int[] nums4 = {1, 2};
        System.out.println("Peak index: " + findPeakElement(nums4));
        // Expected: 1
    }
}

