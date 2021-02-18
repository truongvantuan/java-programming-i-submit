
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");

        String fileName = scanner.nextLine();

        Scanner fileInput = new Scanner(Paths.get(fileName));

        while (fileInput.hasNextLine()) {
            String row = fileInput.nextLine();
            System.out.println(row);
        }
    }
}
