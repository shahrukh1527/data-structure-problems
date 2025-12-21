package com.example.data_structure.sliding_window;

public class Demo1 {
    public static String getFormattedString(String input){
        StringBuilder result =new StringBuilder();
        int count =0;
        char currentChar = input.charAt(0);

        for(char ch: input.toCharArray()){
           if(ch== currentChar){
               count++;
           } else{
               result.append(currentChar).append(count);
               currentChar = ch;
               count=1;
           }
        }
        result.append(currentChar).append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getFormattedString("aaaabbccccc"));
    }
}
