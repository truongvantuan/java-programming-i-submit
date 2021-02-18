
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int page = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, page, year));
        }

        System.out.print("What information will be printed? ");

        String input = scanner.nextLine();

        if (input.equals("everything")) {
            books.forEach((book) -> {
                System.out.println(book);
            });
        } else if (input.equals("name")) {
            books.forEach((book) -> {
                System.out.println(book.getTitle());
            });
        }
    }
}
