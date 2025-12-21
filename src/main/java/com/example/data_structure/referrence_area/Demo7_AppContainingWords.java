package com.example.data_structure.referrence_area;

import java.util.ArrayList;
import java.util.List;

//TODO: will check later
public class Demo7_AppContainingWords
{
//    public static String[] getAppContainingWord(String[] names,String target){
    public static List<String> getAppContainingWord(String[] names,String target){
//        String[] result = new String[names.length];
        List<String> result = new ArrayList<>();
        for (String s:names){
            if(s.contains(target)){
                result.add(s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        System.out.println(getAppContainingWord(arr, prefix));
    }
}
