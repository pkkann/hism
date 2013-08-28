
package control;

import java.util.ArrayList;
import model.Person;

/**
 *
 * @author pkann
 */
public class PersonKatalog {
    
    private ArrayList<Person> personer;
    
    public PersonKatalog() {
        personer = new ArrayList<>();
    }
    
    public void addPerson(Person p) {
        personer.add(p);
    }
    
    public void removePerson(Person p) {
        personer.remove(p);
    }

}
