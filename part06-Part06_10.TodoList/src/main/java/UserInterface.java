
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            addTask();
        } else if (command.equals("list")) {
            listTask();
        } else {
            removeTask();
        }
    }

    public void addTask() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.todoList.add(task);
    }

    public void listTask() {
        this.todoList.print();
    }

    public void removeTask() {
        System.out.print("Which one is removed: ");
        int index = Integer.parseInt(scanner.nextLine());
        this.todoList.remove(index);
    }

}
