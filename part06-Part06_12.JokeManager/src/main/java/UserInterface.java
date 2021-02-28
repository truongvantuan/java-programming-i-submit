
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String command = printMenu();
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }

    public String printMenu() {
        System.out.println("Commands:\n"
                + "1 - add a joke\n"
                + "2 - draw a joke\n"
                + "3 - list jokes\n"
                + "X - stop");
        String command = scanner.nextLine();
        return command;
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            add();
        } else if (command.equals("2")) {
            draw();
        } else if (command.equals("3")) {
            list();
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void draw() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void list() {
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }

}
