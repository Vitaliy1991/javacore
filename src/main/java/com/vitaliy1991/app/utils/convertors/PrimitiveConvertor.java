package com.vitaliy1991.app.utils.convertors;

/**
 * Created by vitor on 02-Feb-17.
 */
public class PrimitiveConvertor {
    float myFloat = 100f;
    char myChar = 'v';
    int myInt = 126;

    public char floatToChar(float myFloat){
        char myChar = (char) myFloat;
        return myChar;
    }

    public void floatToChar(){
        System.out.println("Input float value is "+ myFloat + ". Output char value is " + myChar);
    }

    public char intToChar (int myInt){
        return (char) myInt;
    }

    public void intToChar(){
        System.out.println("Input int value is "+ myInt + ". Output char value is " + myChar);
    }

    public int charToInt(char myChar){
        return (int) myChar;
    }

    public void charToInt(){
        System.out.println("Input char value is "+ myChar + ". Output int value is " + myInt);
    }
}
