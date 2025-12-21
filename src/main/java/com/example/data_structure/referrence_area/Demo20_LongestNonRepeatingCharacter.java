package com.example.data_structure.referrence_area;

public class Demo20_LongestNonRepeatingCharacter {
    public static void getLongestNonRepeatingCharacter(String input){
        if(input ==null || input.isEmpty()){
            System.out.println("Empty string");
            return;
        }

        int maxLength=1;
        int maxStart =0;

        int currLength=1;
        int currStart =0;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                currLength++;
            }else{
                currLength=1;
                currStart=i;
            }

            if(currLength>maxLength){
                maxLength=currLength;
                maxStart =currStart;
            }
        }

        String longestSubstring = input.substring(maxStart, maxStart + maxLength);
        System.out.println("Index = " + maxStart + ", Substring = \"" + longestSubstring + "\"");

    }

    public static void main(String[] args) {
        getLongestNonRepeatingCharacter("aabbbbbbccccccccccccDD");
    }
}
