package com.example.data_structure.michael_session;

import java.util.Stack;


public class Demo9_ValidParanthesis {
    public static boolean getValidBraces(String input){
        Stack<Character> stack = new Stack<>();

        for(char c:input.toCharArray()){
            if(c=='('){
                stack.push(')');
            } else if(c=='['){
                stack.push(']');
            } else if(c=='{'){
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(getValidBraces("[{()[]}()]")); //true
        System.out.println(getValidBraces("()[]{}")); //true
        System.out.println(getValidBraces("(]")); //false
        System.out.println(getValidBraces("([])")); //true
        System.out.println(getValidBraces("([)]")); //false
    }
}
