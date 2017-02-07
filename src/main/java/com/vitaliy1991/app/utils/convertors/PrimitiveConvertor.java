package com.vitaliy1991.app.utils.convertors;

/**
 * Created by vitor on 02-Feb-17.
 */
public class PrimitiveConvertor {
    /*float myFloat;
    char myChar;
    int myInt;*/

    public char floatToChar(float myFloat){
        char myChar = (char) myFloat;
        System.out.println("Input float value is "+ myFloat + ". Output char value is " + myChar);
        return (char) myFloat;
    }

    public char intToChar(int myInt){
        char myChar = (char) myInt;
        System.out.println("Input int value is "+ myInt + ". Output char value is " + myChar);
        return (char) myInt;
    }

    public int charToInt(char myChar){
        int myInt = (int) myChar;
        System.out.println("Input char value is "+ myChar + ". Output int value is " + myInt);
        return (int) myChar;
    }
}
