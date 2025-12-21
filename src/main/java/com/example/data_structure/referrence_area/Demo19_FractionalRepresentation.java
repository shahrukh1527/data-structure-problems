package com.example.data_structure.referrence_area;

import java.util.*;

public class Demo19_FractionalRepresentation {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) return "NaN"; // division by zero
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to avoid overflow (e.g., Integer.MIN_VALUE)
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Append integer part
        result.append(num / den);
        long remainder = num % den;

        if (remainder == 0) {
            return result.toString(); // No fractional part
        }

        result.append(".");

        // Map to store remainder and its position in result
        Map<Long, Integer> remainderMap = new HashMap<>();
        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                int startPos = remainderMap.get(remainder);
                result.insert(startPos, "(");
                result.append(")");
                break;
            }

            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 2));     // "0.5"
        System.out.println(fractionToDecimal(1, -2));    // "-0.5"
        System.out.println(fractionToDecimal(50, 22));   // "2.(27)"
        System.out.println(fractionToDecimal(1, 3));     // "0.(3)"
        System.out.println(fractionToDecimal(-1, -6));   // "0.1(6)"
    }
}

