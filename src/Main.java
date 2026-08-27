import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int number = 12345;

//        //print
//        printDigits(number);
//
//        System.out.print("Total count: ");
//        System.out.println(countDigits(number));
//        System.out.print("Total sum: ");
//        System.out.println(sumDigits(number));
//        System.out.print("Total multiply: ");
//        System.out.println(multiplyDigits(number));
//        System.out.print("Reverse Number: ");
//        System.out.println(reverseNumber(number));


        // isPalindrome
        isPalindrome(number);

        // isPrime or Not
        System.out.println(isPrime(27));

    }

    static void printDigits(int number) {

        while (number != 0) {
            int digit = number % 10;
            System.out.println(digit);

            //condition update
            number /= 10;
        }

    }

    static int countDigits(int number) {

        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count++;

            //condition update
            number /= 10;
        }

        return count;

    }

    static int sumDigits(int number) {

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;

            //condition update
            number /= 10;
        }

        return sum;

    }

    static int multiplyDigits(int number) {

        int multiplyTotal = 1;
        while (number != 0) {
            int digit = number % 10;
            multiplyTotal *= digit;

            //condition update
            number /= 10;
        }

        return multiplyTotal;

    }

    static int reverseNumber(int number) {


        int newNumber = 0;

        while (number != 0) {
            int digit = number % 10;

            newNumber = newNumber * 10 + digit;
            //condition update
            number /= 10;
        }

        return newNumber;


    }

    static void isPalindrome(int number) {

        if (number == reverseNumber(number)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean isPrime(int number) {

        int result;
        for (int i = 2; i < Math.sqrt(number - 1); i++) {
            result = number % i;

            if (result == 0) {
                return false;
            }
        }

        return true;

    }
}
