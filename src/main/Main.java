package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        num1 = in.nextInt();

        System.out.print("Enter the second value: ");
        num2 = in.nextInt();

        in.close();

        System.out.println("\nConcatenation: " + num1 + num2);
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Sum (Post Operation): " + (num1++ + num2));
        System.out.println("Concatenation: " + num1 + num2);
        System.out.println("Sum (Pre Operation): " + (++num1 + num2));
        System.out.println("Concatenation: " + num1 + num2);
    }
}
