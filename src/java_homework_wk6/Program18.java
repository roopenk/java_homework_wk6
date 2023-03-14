package java_homework_wk6;

/**
 * a  program to perform and print the addition, subtraction, multiplication and division of given two numbers
 */

public class Program18 {
    public static void main(String[] args) {
    Program18 obj = new Program18();
    obj.add(125,24 );
    obj.sub(125,24);
    obj.mul(125,24);
    obj.div(125,24);
    obj.mod(125,24);

    }
    public void add(int a, int b){
        int c = a + b;
        System.out.println("The Summation of Two Numbers : " + c);
    }
    public void sub(int a, int b){
        int c = a - b;
        System.out.println("The Subtraction of Two Numbers : " + c);
    }
    public void mul(int a, int b){
        int c = a * b;
        System.out.println("The Multiplication of Two Numbers : " + c);
    }
    public void div(int a, int b){
        int c = a / b;
        System.out.println("The Division of Two Numbers : " + c);
    }
    public void mod(int a, int b){
        double c = a % b;
        System.out.println("The Remainder of Two Numbers : " + c);
    }
}
