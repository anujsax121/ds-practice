package com.practice.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char target = stack.pop();
                if (!map.containsKey(target) || map.get(target) != c) {
                    return false;
                }
            }
        } if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
