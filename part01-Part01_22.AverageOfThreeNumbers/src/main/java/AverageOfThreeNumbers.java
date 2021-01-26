
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int sum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        sum += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        sum += Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double) sum / 3));
        // Write your program here

    }
}
