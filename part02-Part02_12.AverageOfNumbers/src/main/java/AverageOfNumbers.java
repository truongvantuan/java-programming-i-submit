
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count, sum;
        count = sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }
            count++;
            sum += number;
        }

        System.out.println("Average of the numbers: " + (double) sum / count);
    }
}
