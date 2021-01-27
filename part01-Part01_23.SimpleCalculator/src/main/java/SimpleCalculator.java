
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        secondNumber = Integer.valueOf(scanner.nextLine());

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
    }
}
