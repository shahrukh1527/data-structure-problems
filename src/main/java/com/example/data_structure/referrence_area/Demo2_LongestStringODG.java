package com.example.data_structure.referrence_area;

public class Demo2_LongestStringODG
{
    public static String getLongestString(String[] words,String target){
        String targetNew = target.toLowerCase();
        String best="";
        for(String str:words){
            String strNew = str.toLowerCase();
            if(strNew.contains(targetNew) && str.length()>best.length()){
                best =str;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        String[] words = new String[]{"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        System.out.println(getLongestString(words,"ODG"));
    }
}
