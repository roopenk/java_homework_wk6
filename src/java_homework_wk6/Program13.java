package java_homework_wk6;

/** program to perform and print the average of three numbers entered by user
 *
  */
import java.util.Scanner;
public class Program13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number : ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("PLease Enter The Second Number : ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter The Third Number : ");
        int c = Integer.parseInt(scan.nextLine());
        Program13 obj = new Program13(); // object creation
        obj.average(a,b,c); // instance method called using an object
    }
    public void average(int a,int b,int c) { // instance method
        double av = (a + b + c);
        double avg = (av / 3);
        System.out.println("The Average of Entered Three Numbers : " + av);
    }

}
