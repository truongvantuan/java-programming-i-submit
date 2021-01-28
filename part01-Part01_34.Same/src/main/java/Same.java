
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstStr = scan.nextLine();

        System.out.println("Enter the second string:");
        String secondStr = scan.nextLine();

        if (secondStr.equals(firstStr)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        // Write your program here. 
    }
}
