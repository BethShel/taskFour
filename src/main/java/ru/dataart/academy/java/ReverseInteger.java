package ru.dataart.academy.java;


import static java.lang.Math.abs;

public class ReverseInteger {
    /**
     * @param - inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */

    public int reverse(int inputNumber){
        int a =2147483647;
        int save = inputNumber;
        int result = 0;
        int counter = 0;
        while (inputNumber != 0) {
            result = result * 10 + abs(inputNumber) % 10;
            inputNumber /= 10;
            if (counter == 8) {
                if (result > 214748364) {
                    return a;
                } else {
                    if (abs(inputNumber) % 10 == 2) {
                        return a;
                    }
                }
            }
            counter++;
        }
        if (save < 0)
            result = -result;
        return result;
    }
}
