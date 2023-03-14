package java_homework_wk6;

/**
 * Calculator Program to perform addition, subtraction, multiplication and division
 * with parameters and using concatenation
 * with two static and two instance methods
 */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Program5 obj = new Program5();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter Second Number: ");
        int b = Integer.parseInt(scan.nextLine());
        addition(a, b);
        subtract(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
        scan.close();
    }
    // Summation method: with params
    public static void addition(int a, int b) {
        int ans1 = a + b;
        System.out.println("The Addition of Inputted Numbers : " + ans1);
    }
    // Subtraction method: with params
    public static void subtract(int a, int b){
        int ans1 = a - b;
        System.out.println("The Division of Inputted Numbers : " + ans1);
    }
    // Multiplication method: with params and instance method
    public void multiplication(int a, int b){
        int ans1 = a * b;
        System.out.println("The Multiplication of Inputted Numbers : " + ans1);
    }
    // Division method: with params and instance method
    public void division(int a, int b){
        int ans1 = a / b;
        System.out.println("The Division of Inputted Numbers : " + ans1);
    }
}