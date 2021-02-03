
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int value = scanner.nextInt();
        
        for (int i = value - 1; i > 0; i--) {
            value *= i;
        }
        System.out.println("Factorial: " + value);
    }
}
