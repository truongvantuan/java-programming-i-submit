
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count, sum;
        count = sum = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number >= 0) {
                count++;
                sum += number;
            }
        }
        if (count == 0) {
            System.out.println("Cannot canculate the average");
        } else {
            System.out.println((double) sum / count);
        }
    }
}
