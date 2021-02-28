
import java.util.ArrayList;
import java.text.MessageFormat;

public class TodoList {

    private ArrayList<String> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();
    }

    public void add(String task) {
        this.taskList.add(task);
    }

    public void print() {
        int index = 0;
        while (index < this.taskList.size()) {
            System.out.println(MessageFormat.format("{0}: {1}", index + 1, this.taskList.get(index)));
            index++;
        }
    }

    public void remove(int indexOfTask) {
        this.taskList.remove(indexOfTask - 1);
    }
}
