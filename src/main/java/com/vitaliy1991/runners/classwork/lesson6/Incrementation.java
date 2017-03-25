package com.vitaliy1991.runners.lesson6;

/**
 * Created by vitor on 24-Mar-17.
 */
public class Incrementation {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original: " + a);
        System.out.println("Post-increment: " + a++);
        System.out.println("After post-increment: " + a);
        System.out.println("Pre-increment: " + ++a);
        System.out.println("After pre-increment: " + a);
    }
}
