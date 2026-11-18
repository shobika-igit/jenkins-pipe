package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int num;


        if (args.length > 0) {
            num = Integer.parseInt(args[0]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }


        int original = num;
        int reverse = 0;


        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }


        if (original == reverse && original >= 0)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}