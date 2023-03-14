package java_homework_wk6;
/** the program to convert temperature into degree Celsius by accepting Fahrenheit from user
 *
  */
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Temperature in Fahrenheit : ");
        double f = Double.parseDouble(scan.nextLine());
        temp(f);
    }
    public static void temp(double f){
        double f1;
        f1 = (( f - 32 ) * 5 / 9 );
        System.out.println("The Temperature in Degree Celsius : " + f1);
    }
}
