package ru.dataart.academy.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        //System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
        //System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483647));
        //System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(1147483648));
        int result=reverseInteger.reverse(-2147483647);
        if(result==2147483647){
            try {
                throwsInSignature();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("A number has been entered that cannot be converted");
        }
        else{
            System.out.println("Reverse integer works: " + result);
        }
    }
    private static void throwsInSignature() throws IOException {
        throw new IOException("Error");
    }
}