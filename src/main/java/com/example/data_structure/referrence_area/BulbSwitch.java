package com.example.data_structure.referrence_area;

public class BulbSwitch {
    public static int bulbSwitch(int n) {
        double sq = Math.sqrt(n);
        double floor = Math.floor(sq);
        return (int) floor;
    }

    public static void main(String[] args) {
        System.out.println(bulbSwitch(6));
        System.out.println(bulbSwitch(10));
    }


}
