package java_homework_wk6;
/** a program to convert an upper case string into equivalent lower case string
 *
 */

import java.util.Scanner;

public class Program19 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter Any Upper Case String : " );
            String A = scan.nextLine();
            Program19 obj = new Program19();
            obj.conversion(A);
        }
        public void conversion(String A){
            String a = A.toLowerCase();
            System.out.println("The Equivalent Lower Case String : " + a);
        }
    }

