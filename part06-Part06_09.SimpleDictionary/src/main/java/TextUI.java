
import java.text.MessageFormat;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            processCommand(input);
            System.out.println("");
        }
        System.out.println("Bye Bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknow commmand");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        this.dictionary.add(word, translation);

    }

    public void search() {
        System.out.print("To be translated: ");

        String word = scanner.nextLine();

        String translatedWord = this.dictionary.translate(word);

        if (translatedWord == null) {
            System.out.println(MessageFormat.format("Word {0} was not found", word));
        } else {
            System.out.println("Translation: " + translatedWord);
        }

    }
}
