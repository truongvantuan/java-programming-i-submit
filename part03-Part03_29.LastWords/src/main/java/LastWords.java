
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            } else {
                String[] words = str.split(" ");
                System.out.println(words[words.length - 1]);
            }
        }

    }
}
