import org.w3c.dom.ls.LSOutput;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* DECLARACION DE VARIABLES
        int x = 123;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Bro";

        System.out.println("Hello "+name);
        */

        /* SWAP TWO VARIABLES
        String x = "Water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name bitch? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
    }
}