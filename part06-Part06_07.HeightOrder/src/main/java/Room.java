
import java.util.ArrayList;

public class Room {

    ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);
        int shortestHeight = persons.get(0).getHeight();
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getHeight() < shortestHeight) {
                shortest = persons.get(i);
                shortestHeight = persons.get(i).getHeight();
            }
        }
        return shortest;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        persons.remove(shortest);
        return shortest;
    }
}
