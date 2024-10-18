//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // SWITCH
        // switch = statement that allows a variable to be for equality against a list of value.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a day: ");
        String day  = scanner.nextLine();

        switch (day){
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It es Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That is not a day");
        }
    }
}