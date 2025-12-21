package com.example.data_structure.referrence_area;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo16_ValidIPAndCount {

    public static boolean isValidIP(String ip){
        String[] parts = ip.split("\\.");
        for(String part:parts){
            int num = Integer.parseInt(part);
            if(num<0 ||num>255){
                return false;
            }
        }
        return true;
    }
    public static String getMaxIP(String[] logs){
        Map<String,Integer> ipCount = new HashMap<>();
        String ipRegex = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";

        Pattern pattern = Pattern.compile(ipRegex);

        for(String log:logs){
            Matcher matcher = pattern.matcher(log);

            if(matcher.find()){
                String ip = matcher.group();
                if(isValidIP(ip)){
                   ipCount.put(ip,ipCount.getOrDefault(ip,0)+1);
                }
            }
        }

//        System.out.println(ipCount);
        String maxIP = null;
        int maxCount =0;

        for(Map.Entry<String,Integer> entry: ipCount.entrySet()){
            if(entry.getValue() >maxCount ){
                maxCount = entry.getValue();
                maxIP = entry.getKey();
            }
        }

        return maxIP;
    }
    public static void main(String[] args) {

        String[] logs = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93"
        };

        System.out.println(getMaxIP(logs));

    }
}
