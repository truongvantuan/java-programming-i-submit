
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnPerson = this.personList.get(0);

        for (Person ps : this.personList) {
            if (ps.getHeight() < returnPerson.getHeight()) {
                returnPerson = ps;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnPerson = this.shortest();

        this.personList.remove(returnPerson);
        return returnPerson;
    }
}
