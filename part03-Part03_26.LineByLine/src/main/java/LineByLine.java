
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            
            if (str.equals("")) {
                break;
            } else {
                String[] words = str.split(" ");
                for (String item : words) {
                    System.out.println(item);
                }
            }
        }
    }
}
