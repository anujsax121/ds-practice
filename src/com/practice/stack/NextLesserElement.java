package com.practice.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextLesserElement {

    public static void main(String[] args) {
        int n[] = {4, 5, 2, 25};
        List<Integer> list = getNextLesserElement(n);
        System.out.println(list); //[5, 25, 25, -1]
    }

    private static List<Integer> getNextLesserElement(int[] n) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = n.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(-1);
                stack.push(n[i]);
            } else if (n[i] > stack.peek()) {
                list.add(stack.peek());
                stack.push(n[i]);
            } else if (n[i] < stack.peek()) {
                while ((!stack.isEmpty()) && n[i] < stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
                stack.push(n[i]);
            }
        }
        Collections.reverse(list);
        return list;

    }
}
