
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner fileInput = new Scanner(Paths.get(file))) {

            while (fileInput.hasNextLine()) {

                String line = fileInput.nextLine();
                list.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < list.size(); i++) {
            if (lowerBound <= list.get(i) && list.get(i) <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);

    }

}
