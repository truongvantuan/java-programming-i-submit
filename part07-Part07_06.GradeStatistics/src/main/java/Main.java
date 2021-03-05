
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStatictis = new GradeStatistics();

        UserInterface ui = new UserInterface(gradeStatictis, scanner);
        ui.start();
    }
}
