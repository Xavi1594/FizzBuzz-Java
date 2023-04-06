package com.fizzbuzz;

public class FizzbuzzPart1 {

    public static void main(String args[]) {

        for (int i = 1; i <= 100; i++) {

            System.out.println(fizzBuzz(i));
            System.out.println(fizzOrBuzz(i));

        }

    }

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

    public static String fizzOrBuzz(int number) {

        if (number % 3 == 0 || String.valueOf( number).contains("3")) {
            return "FIZZ";
        } else if (number % 5 == 0 || String.valueOf( number).contains("5")) {
            return "BUZZ";
        } else {
            return String.valueOf(number);
        }
}
}