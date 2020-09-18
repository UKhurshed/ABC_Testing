package classes;
import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String birthDay;
    private String registrationDay;
    private String friendsName;
    ArrayList<String> listOfFriends = new ArrayList<>();

    public Person(String firstName, String lastName, Gender gender, String birthDay, String registrationDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.registrationDay = registrationDay;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getRegistrationDay() {
        return registrationDay;
    }

    public void setRegistrationDay(String registrationDay) {
        this.registrationDay = registrationDay;
    }

    public ArrayList<String> getListOfFriends() {
        return listOfFriends;
    }

    public void addNewFriend(String userName) {
        this.friendsName = userName;
        listOfFriends.add(userName);
    }

    public void deleteFriends(String userName){
        listOfFriends.remove(userName);
    }



}
