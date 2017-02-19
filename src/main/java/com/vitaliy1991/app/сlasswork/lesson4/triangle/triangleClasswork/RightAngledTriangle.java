package com.vitaliy1991.app.сlasswork.lesson4.triangle.triangleClasswork;

/**
 * Created by vitor on 16-Feb-17.
 */
public class RightAngledTriangle {
    public boolean isTriangle (int a, int b, int c){
        if(a > 0 && b > 0 && c > 0) {
            return (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b);
            } else {
                return false;
            }
        }
    }
