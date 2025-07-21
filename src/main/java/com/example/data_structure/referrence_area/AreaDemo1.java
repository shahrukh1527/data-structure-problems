package com.example.data_structure.referrence_area;

//count number of character
// aaaabbbccc-a4b3c3
public class AreaDemo1 {
    public static String getFormattedString(String input) {
        int count = 0;
        char[] ch = input.toCharArray();
        char currentChar = ch[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (ch[i] == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = ch[i];
                count = 1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getFormattedString("aaaabbbccddeeeeeee"));
    }
}
