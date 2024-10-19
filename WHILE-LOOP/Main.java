//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // WHILE LOOP
        // While loop = executes a block of code as long as a it's condition remains true.
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String last_name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        do{
            System.out.println("Enter your last name: ");
            last_name = scanner.nextLine();
        }while(last_name.isBlank());
        System.out.println("Hello "+name+" "+last_name);
    }
}