package java_homework_wk6;

/**
 * a program to swap two numbers entered by user
 */

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number : ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter Second Number : ");
        int b = Integer.parseInt(scan.nextLine());
        Program15 obj = new Program15();
        obj.swap(a, b); // instance method called by using an object
    }

    public void swap(int a, int b) { // instance method
        int c = a;
        int d = b;
        System.out.println("The First number : " + d);
        System.out.println("The Second NUmber : " + c);
    }
}
