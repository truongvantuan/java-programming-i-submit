
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        ArrayList<Integer> listInt = new ArrayList<>();

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            }
            listInt.add(value);
            sum += value;
        }

        System.out.println("Average: " + (double) sum / listInt.size());
    }
}
