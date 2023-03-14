package java_homework_wk6;
// java program to perform summation of two binary numbers

import java.util.Scanner;
public class Program16 {

    public static void main(String[] args){ // main method
      Program16 obj = new Program16();
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Binary Number : ");
        String a1 = scan.nextLine();
        System.out.println("Enter Second Binary Number : ");
        String b1 = scan.nextLine();
        scan.close();
        binary(); // calling of method
    }
    public static void binary(){
        // method to perform summation
        String a = "10";
        String b = "11";
        int a1 = Integer.parseInt(a,2);
        int b1 = Integer.parseInt(b,2);
        int sum = a1 + b1;
        System.out.println("The Summation of Two Binary Numbers : " + Integer.toBinaryString(sum));

    }
}
