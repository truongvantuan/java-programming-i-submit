
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            } else {
                String[] words = str.split(" ");
                for (String word : words) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
