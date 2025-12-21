package com.example.data_structure.referrence_area;

import java.util.Arrays;

public class Demo9_ShortestDistanceBetweenWords
{
    public static int getShortestLength(String str,String str1,String str2){

        if(str1.equals(str2)){
            return 0;
        }

        String[] words = str.split(" ");

        int min_dist = (words.length) +1;

        for(int index=0; index<words.length;index++){
            if(words[index].equals(str1)){
              for(int search=0; search< words.length;search++){
                  if(words[search].equals(str2)){
                      int curr = Math.abs(index-search)-1;

                      if(curr<min_dist){
                          min_dist =curr;
                      }
                  }
              }
            }
        }

     return min_dist;
    }
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

        System.out.println(getShortestLength(str,word1,word2));
    }
}
