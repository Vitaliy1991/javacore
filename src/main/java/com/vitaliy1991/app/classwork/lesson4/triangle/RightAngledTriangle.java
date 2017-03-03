package com.vitaliy1991.app.classwork.lesson4.triangle;

/**
 * Created by vitor on 16-Feb-17.
 */
public class RightAngledTriangle {
    public boolean isTriangle (int a, int b, int c){
        if(a > 0 && b > 0 && c > 0 && a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            return true;
            } else {
                return false;
            }
        }
    }
