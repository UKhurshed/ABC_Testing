package abstracts;

import java.util.Date;
import java.util.List;

public abstract class SocialNetwork {
    private String name;
    private String creationDate;
    private List<Person> listOfPerson;

    public SocialNetwork(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public abstract void registration(Person person);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public List<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(List<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

}
