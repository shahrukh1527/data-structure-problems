package com.example.data_structure.referrence_area;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//first non repeating character
public class Demo8_FirstNonRepeatingCharacter
{
    public static Character getFirstNonRepeatingCharacter(String input){
        Map<Character,Integer> freqMap = new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            int freq = freqMap.getOrDefault(c,0);
            freqMap.put(c,freq+1);
        }
        System.out.println(freqMap);

        Character temp=null;
        for(int i=0;i<input.length();i++){
           char c = input.charAt(i);
           int fre = freqMap.get(c);
           if(fre==1){
               temp= c;
               break;
           }
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingCharacter("bbaabbcdefc"));
    }
}
