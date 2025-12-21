package com.example.data_structure.sliding_window;

public class Demo2 {
    public static int getLongestString(String[] str,String toSearch){
        int count = Integer.MIN_VALUE;

        for(String s: str){
            String newS = s.toLowerCase();
            if(newS.contains(toSearch.toLowerCase())){
                count = Math.max(count,s.length());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};

        String toSearch = "ODG";
        System.out.println(getLongestString(str,toSearch));
    }
}
