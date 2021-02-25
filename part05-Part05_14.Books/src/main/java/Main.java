
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            Book addBook = new Book(name, year);

            if (!books.contains(addBook)) {
                books.add(addBook);
            }
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
