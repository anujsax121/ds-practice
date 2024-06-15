package com.practice.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousLesserElement {

    public static void main(String[] args) {
        int n[] = {4, 5, 2, 25};
        List<Integer> list = getPreviousLesserElement(n);
        System.out.println(list);
    }

    private static List<Integer> getPreviousLesserElement(int[] n) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i< n.length; i++) {
            if(stack.isEmpty()) {
                list.add(-1);
                stack.push(n[i]);
            } else if(n[i] > stack.peek()) {
                list.add(stack.peek());
                stack.push(n[i]);
            } else if(n[i] < stack.peek()) {
                while((!stack.isEmpty()) && n[i] < stack.peek()) {
                   stack.pop();
                }
                if(stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
                stack.push(n[i]);
            }
        }
        return list;
    }
}
