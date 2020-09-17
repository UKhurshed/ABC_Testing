package classes;

import abstracts.Person;
import abstracts.SocialNetwork;

import java.util.ArrayList;

public class Ok extends SocialNetwork {

    ArrayList<Person> listOfUser = new ArrayList<Person>();

    public Ok(String name, String creationDate) {
        super(name, creationDate);
    }

    @Override
    public void registration(Person person) {
        listOfUser.add(person);
    }

    public int countOfUser() {
        return listOfUser.size();
    }
}
