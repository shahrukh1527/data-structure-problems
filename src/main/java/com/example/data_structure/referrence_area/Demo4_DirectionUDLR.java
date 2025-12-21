package com.example.data_structure.referrence_area;

import java.util.Arrays;

public class Demo4_DirectionUDLR
{
    public static int[] getCorrdinates(String input){
        int x=0;
        int y=0;

        char[] chars =input.toCharArray();

        for(char ch:chars){
            if(ch=='U'){
                y++;
            } else if(ch=='D'){
                y--;
            } else if(ch=='R'){
                x++;
            } else if(ch=='L'){
                x--;
            } else{
                throw new RuntimeException("Invalid input");
            }
        }
        return  new int[]{x,y};
    }
    public static void main(String[] args) {
        int[] corrdinates = getCorrdinates("URRDDL");
        System.out.println(Arrays.toString(corrdinates));
    }
}
