package com.example.data_structure.binary_search;

public class BS_Leetcode_875 {

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if (hours <= h) {
                high = mid;   // try smaller speed
            } else {
                low = mid + 1; // need higher speed
            }
        }

        return low;
    }

    private static long calculateHours(int[] piles, int speed) {
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed; // ceil division
        }

        return totalHours;
    }

    // =================== MAIN METHOD ===================
    public static void main(String[] args) {

        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Min speed: " + minEatingSpeed(piles1, h1));
        // Expected: 4

        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Min speed: " + minEatingSpeed(piles2, h2));
        // Expected: 30

        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Min speed: " + minEatingSpeed(piles3, h3));
        // Expected: 23
    }
}

