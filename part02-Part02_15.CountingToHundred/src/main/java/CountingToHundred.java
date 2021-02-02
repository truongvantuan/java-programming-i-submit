
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());

        for (int i = value; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
