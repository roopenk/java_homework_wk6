package java_homework_wk6;

/** a program to convert a user entered decimal number into equivalent binary form
 *
 */
import java.util.Scanner;
public class Program17 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Decimal Number : ");
        int a = Integer.parseInt(scan.nextLine());
        Program17 obj = new Program17();
        obj.binary(a);
    }
    public void binary(int a){ // instance method
        String b = Integer.toBinaryString(a);
        System.out.println("The Equivalent Binary Number : " + b);
    }
}
