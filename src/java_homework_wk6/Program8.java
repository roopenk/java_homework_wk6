package java_homework_wk6;
import java.util.Scanner;
/** the program to calculate the area of a triangle by accepting base and height from user
 *
 */

public class Program8 {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter The Base Value of Triangle : ");
    double b = Double.parseDouble(scan.nextLine());
    System.out.println("Please Enter The Height Value of Triangle : ");
    double h = Double.parseDouble(scan.nextLine());
    Program8 obj = new Program8();
    obj.area(b,h); // instance method called in main method using an object
}
public void area(double b, double h){ // instance method
    double a = (1.5 * b * h);
    System.out.println("The Area of Triangle : " + a);
}
}
