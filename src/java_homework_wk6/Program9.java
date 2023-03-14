package java_homework_wk6;
import java.util.Scanner;
/** program to convert the upper case character to its equivalent lower case by user input
 *
  */
public class Program9 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Upper Case Character :" );
        String A = scan.nextLine();
        Program9 obj = new Program9();
        obj.conversion(A);
    }
    public void conversion(String A){
         String a = A.toLowerCase();
         System.out.println("The Equivalent Lower Case Character : " + a);
    }
}
