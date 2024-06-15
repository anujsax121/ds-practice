package com.practice.exception;

public class Test {

    public static void main(String[] args) {
        boolean flag = display();
        System.out.println(flag);
    }


    private static boolean display() {

        try {
            System.out.println("Hello I am in try block");
            return true;
        }
        catch (Exception e) {
            System.out.println("Hello I am in catch block");
        } finally {
            System.out.println("Hello I am in finally block");
            return false;
        }

    }
}
