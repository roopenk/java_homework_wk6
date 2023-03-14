package java_homework_wk6;

/**
 * program to Calculate the following equation
 * ((25.5 * 3.5 -3.5 * 3.5) / (40.5 - 4.5))
 */
public class Program12 {
    public static void main(String[] args) {
        Program12 obj = new Program12();
        obj.eqa();

    }
    public void eqa() {
        double a = 25.5, b = 3.5, c = 40.5, d = 4.5, r, r1;
        r = (a * b - b * b);
        r1 = (r / (c - d));
        System.out.println("The Equation : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.println("The Expected Output : " + r1);
    }
}
