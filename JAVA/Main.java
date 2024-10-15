import org.w3c.dom.ls.LSOutput;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // MATH OPERATIONS
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        b = scanner.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hipotenuse is: "+c);
        scanner.close();

        Random random = new Random();
        int x = random.nextInt(6)+1; //+1 para evitar que aparezca el 0
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println("Random INT: "+x+"\nRandom DOUBLE: "+y+"\nRandom BOOLEAN: "+z);
        /*
        double x = 3.14;
        double y = -10;

        double M = Math.max(x, y);
        double m = Math.min(x, y);
        double a = Math.abs(y);
        double s = Math.sqrt(x);
        double r = Math.round(x);
        double c = Math.ceil(x);
        double f = Math.floor(x);

        System.out.println("We have two numbers: 3.14 y -10");
        System.out.println("The MAX number is: "+M+"\nThe min number is: "+m+"\nThe absolute value of -10 is: "+a);
        System.out.println("The squart of 3.14 is: "+s+"\nThe round of 3.14 is: "+r+"\nThe ceil of 3.14 is: "+c);
        System.out.println("The floor od 3.14 is: "+f);
        */

    }
}