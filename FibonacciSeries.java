package Day6Assign;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 100; // maximum value to check for prime numbers

        System.out.println("Prime numbers between 1 and " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}