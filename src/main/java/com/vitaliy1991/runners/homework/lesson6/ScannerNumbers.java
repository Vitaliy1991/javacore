package com.vitaliy1991.runners.homework.lesson6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by vitor on 26-Mar-17.
 */
public class ScannerNumbers {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        System.out.println("Please enter number; put Enter to continue; enter Exit to stop");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("Please enter number: ");
            String number = reader.readLine();
            if (number.equals("Exit")) break;
                else sum = sum + Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
