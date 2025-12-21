package com.example.data_structure.referrence_area;

import java.util.*;

public class Demo17_StringThatCanbeFormedWithTheWord {
//    public static List<String> getMatchingWords(String[] words,String target){
//
//        List<String> result = new ArrayList<>();
//
//        Map<Character,Integer> characterFreqCount = new HashMap<>();
//
//        for (char c: target.toCharArray()){
//            characterFreqCount.put(c,characterFreqCount.getOrDefault(c,0)+1);
//        }
//
//        for(String word: words){
//            if(word.length()== target.length()){
//                Map<Character,Integer> wordFreqCount = new HashMap<>();
//
//                for (char c: word.toCharArray()){
//                    wordFreqCount.put(c,wordFreqCount.getOrDefault(c,0)+1);
//                }
//                if(wordFreqCount.equals(characterFreqCount)){
//                    result.add(word);
//                }
//            }
//        }
//    return result;
//    }

    public static List<String> getMatchingWords(String[] words,String target){
        List<String> results = new ArrayList<>();
        String targetNew = sortString(target);
        for(String word : words){
            if (word.length() == targetNew.length() && sortString(word).equals(targetNew)){
                results.add(word);
            }
        }
        return  results;
    }

    public static String sortString(String input){
        char[] ch =input.toCharArray();

        Arrays.sort(ch);

        return new String(ch);
    }

    public static void main(String[] args) {
        String[] s = new String[]{"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
//        String[] s = new String[]{"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};



        String target ="abcd";
//        String target ="caab";
        System.out.println(getMatchingWords(s,target));
    }
}
