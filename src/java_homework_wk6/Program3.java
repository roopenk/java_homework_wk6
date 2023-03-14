package java_homework_wk6;

/**
 * Program to declare static, instance variables, call them into static and instance methods
 * call both methods in the main method
 */

public class Program3 {
    int a = 25; // instance variable
    static int b = 25; // static variable

    public void method() { // instance method
        Program3 obj = new Program3();
        System.out.println("The Instance Variable Called by Instance Method : " + obj.a);
        System.out.println("The Static Variable Called by Instance Method : " + b);
    }

    public static void method1() { // static method
        Program3 obj1 = new Program3();
        System.out.println("The Instance Variable Called by Static Method : " + obj1.a);
        System.out.println("The Static Variable Called by Static Method : " + b);
    }

    public static void main(String[] args) {
        Program3 mtd = new Program3();
        mtd.method();
        method1();
    }
}
