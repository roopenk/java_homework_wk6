package java_homework_wk6;

public class Program4 {
    int a = 24, b = 25; // instance variables
    static int c = 15, d = 16; // static variables
    public void method(){ // instance method
        Program4 obj = new Program4();
        System.out.println("The Instance Variable Called by Instance Method : " + obj.a);
        System.out.println("The Instance Variable Called by Instance Method : " + obj.b);
        System.out.println("The Static Variable Called by Instance Method : " + c);
        System.out.println("The Static Variable Called by Instance Method : " + d);
    }
    public static void method1(){ // static method
        Program4 obj1 = new Program4();
        System.out.println("The Instance Variable Called by Static Method : " + obj1.a);
        System.out.println("The Instance Variable Called by Static Method : " + obj1.b);
        System.out.println("The Static Variable Called by Static Method : " + c);
        System.out.println("The Static Variable Called by Static Method : " + d);

    }
    public static void main(String[] args){
        Program4 mtd = new Program4();
        mtd.method();
        method1();

    }
}
