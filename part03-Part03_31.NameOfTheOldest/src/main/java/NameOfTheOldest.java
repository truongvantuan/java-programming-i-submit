
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOdlest = null;
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1]);
            if (oldest < age) {
                oldest = age;
                nameOfOdlest = parts[0];
            }

        }

        System.out.println("Name of the oldest: " + nameOfOdlest);
    }
}
