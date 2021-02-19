
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileInput = new Scanner(Paths.get(file))) {

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] part = line.split(",");
                
                System.out.println(part[0] + ", age: " + part[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
