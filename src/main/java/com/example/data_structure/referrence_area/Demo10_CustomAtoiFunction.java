package com.example.data_structure.referrence_area;

public class Demo10_CustomAtoiFunction {

    public static int customAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        int sign = 1;
        int startIndex = 0;
        int result = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
            if (str.length() == 1) {
                return -1; // Just a "-" is invalid
            }
        }

        for (int i = startIndex; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return -1;
            }

            result = result * 10 + (ch - '0');
        }

        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(customAtoi("123"));
        System.out.println(customAtoi("-123"));
        System.out.println(customAtoi("1a23"));
        System.out.println(customAtoi("abc"));
        System.out.println(customAtoi(""));
        System.out.println(customAtoi("-"));
    }
}

