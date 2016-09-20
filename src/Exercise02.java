import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by VeryBarry on 9/20/16.
 */
public class Exercise02 {
    public static void main(String[] args) {


        Email[] emails = {
                new Email("alice@gmail.com", "Hello", "yo", false),
                new Email("bob@gmail.com", "Hello", "yo", false),
                new Email("charlie@gmail.com", "Hello", "yo", false),
                new Email("alice@gmail.com", "Hello", "yo", false),
                new Email("bob@gmail.com", "Hello", "yo", false)
        };
        // hashmap that looks like this
        // "alice@gmail.com" -> arraylist of two emails
        //"bob" '' '' ''
        // charlie - > arraylist of 1 email

        HashMap<String, ArrayList<Email>> emailMap = new HashMap<>();

        for (Email e: emails) {
            ArrayList<Email> arr = emailMap.get(e.destination);
            if (arr ==null){
                arr = new ArrayList<>();
                emailMap.put(e.destination, arr);
            }
            arr.add(e);
        }
        System.out.println(emailMap);

        emailMap.clear();


    }
}
