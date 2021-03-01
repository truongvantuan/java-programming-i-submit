
import java.text.MessageFormat;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {

            System.out.println(MessageFormat.format("First: {0}/100\nSecond: {1}/100", first, second));
            System.out.print("> ");

            String input = scan.nextLine();

            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }

            if (command.equals("move")) {
                if (amount > first) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
            }

            if (second > 100) {
                second = 100;
            }

            if (command.equals("remove")) {
                if (second - amount >= 0) {
                    second -= amount;
                } else if (amount > second) {
                    second = 0;
                }
            }
        }
    }

}
