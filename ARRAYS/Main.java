//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 2D Arrays = an array of arrays

        String[][] cars = {
                {"Camaro","Corvette","Silverato"},
                {"Mustang","Ranger","F-150"},
                {"Ferrari","Lambo","Tesla"}
        };

        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}