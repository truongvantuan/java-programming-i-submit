
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> mesList;

    public MessagingService() {
        this.mesList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.mesList.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.mesList;
    }
}
