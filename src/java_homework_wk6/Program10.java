package java_homework_wk6;
/** program to print the table upto 10 for any user entered number
 *
 */

import java.util.Scanner;
public class Program10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number To Obtain Table Values : ");
        int a = Integer.parseInt(scan.nextLine());
        Program10 obj = new Program10();
        obj.table(a); // calling instance method using an object
    }
    public void table(int a){ // instance method
        System.out.println("The Table Values of Entered Number : ");
        System.out.println(a + " x 1 = " + a * 1);
        System.out.println(a + " x 2 = " + a * 2);
        System.out.println(a + " x 3 = " + a * 3);
        System.out.println(a + " x 4 = " + a * 4);
        System.out.println(a + " x 5 = " + a * 5);
        System.out.println(a + " x 6 = " + a * 6);
        System.out.println(a + " x 7 = " + a * 7);
        System.out.println(a + " x 8 = " + a * 8);
        System.out.println(a + " x 9 = " + a * 9);
        System.out.println(a + " x 10 = " + a * 10);

    }
}
