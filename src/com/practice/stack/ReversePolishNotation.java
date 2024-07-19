package com.practice.stack;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        String str[] = new String[]{"3", "11", "5", "+", "-"};
        System.out.println(evalRPN(str));
    }

    private static int evalRPN(String str[]) {

        Stack<Integer> stack = new Stack<Integer>();
        String token = "+-*/";
        for (String s : str) {
            if (!token.contains(s)) {
                stack.push(Integer.valueOf(s));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (s) {
                    case "+": {
                        stack.push(a + b);
                        break;
                    }
                    case "-": {
                        stack.push(b - a);
                        break;
                    }
                    case "*": {
                        stack.push(a * b);
                        break;
                    }
                    case "/": {
                        stack.push(b / a);
                        break;
                    }
                }

            }
        }
        System.out.println(stack);

        return stack.size() == 1 ? stack.peek() : 0;

    }
}
