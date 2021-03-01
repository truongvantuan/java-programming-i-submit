
import java.text.MessageFormat;
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println(MessageFormat.format("First: {0}/100\nSecond: {1}/100",
                    containerOne.contains(), containerTwo.contains()));

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                containerOne.add(amount);
            }

            if (command.equals("remove")) {
                containerTwo.remove(amount);
            }

            if (command.equals("move")) {
                //TO DO
                containerTwo.add(Math.min(containerOne.contains(), amount));
                containerOne.remove(amount);
            }

        }
    }
}
