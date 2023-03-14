package java_homework_wk6;

/** program to calculate and print area and perimeter of rectangle
 *
 */
public class Program14 {
   public static void main(String[] args){
    Program14 obj = new Program14();
    double w = 5.6;
    double h = 8.5;
    obj.area(w ,h); // instance method called by using an object
   }
   public void area(double w , double h){ // instance method
       double a = (w * h);
       double p = (2 * (w + h));
       System.out.println("The Width of Rectangle : 5.6");
       System.out.println("The Height of Rectangle : 8.5");
       System.out.println("The Area of Rectangle : " + a);
       System.out.println("The Perimeter of Rectangle : " + p);
   }
}
