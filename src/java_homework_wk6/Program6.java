package java_homework_wk6;

/** the program to calculate area of a circle by accepting radius from user
 *
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please Enter The Radius Value : ");
        double r = Double.parseDouble(scan.nextLine());
        area(r);
    }

    public static void area(double r) {
        double a, a1;
        double PI = 3.14;
        a = (PI * r);
        a1 = (a * r);
        System.out.println("The Area of The Circle : " + a1);
    }
}