//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // IF-ELSE
        // if statement = performs a block of code if it's condition evaluates ti be true.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age bitch: ");
        int age = scanner.nextInt();

        if(age >= 13 && age < 18){
            System.out.println("You are a teenager!");
        } else if(age < 13 && age > 0){
            System.out.println("You are a kid!");
        } else if (age >= 18 && age < 100) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a sanababish");
        }
    }
}