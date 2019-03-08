
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault( Locale.US);
        Scanner t = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius  = t.nextDouble();
        
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("Pi value %.2f%n", Calculator.PI);
        
        t.close();
        
   
}
  
    
}
