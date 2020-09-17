import abstracts.Person;
import classes.Gender;
import classes.Facebook;
import classes.Instagram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedDate=dateFormat.format(date);


        Person test = new Person("Test", "Testov", Gender.MALE, "10-12-1999", formattedDate);
        test.addNewFriend("Abcd Usdb");
        test.addNewFriend("Abcd1 Usdb");
        test.addNewFriend("Abcd2 Usdb");
        test.addNewFriend("Abcd3 Usdb");

        Person test2 = new Person("Test2","Test2", Gender.MALE, "25-09-2003", formattedDate);
        test2.addNewFriend("Abcd Usdb2");
        test2.addNewFriend("Abcd1 Usdb2");
        test2.addNewFriend("Abcd2 Usdb2");
        test2.addNewFriend("Abcd3 Usdb2");

        System.out.println("Test's" + test.getListOfFriends());
        System.out.println("Test2's" + test2.getListOfFriends());

        Facebook facebook = new Facebook("Facebook", formattedDate);
        facebook.registration(test);
        facebook.registration(test2);
        System.out.println(facebook.countOfUser());

        Instagram instagram = new Instagram("Instagram", formattedDate);
        instagram.registration(test2);
        System.out.println(instagram.countOfUser());


        System.out.println(test2.getRegistrationDay());
    }
}
