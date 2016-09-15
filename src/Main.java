import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Main {
    public static void main(String[] args){

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        int index = 0;
        //regular while loop
        while(index < names.length){
            System.out.println(names[index]);
            index++;
        }
        //traditional for loop
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        //new for loop
        for (String name : names) {
            System.out.println(name);
        }


        ArrayList<String> names2 = new ArrayList();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");
        names2.remove(1);
        System.out.println(names2);

        HashMap<String, Object> person = new HashMap();
        person.put("name", "Alice");
        person.put("age", 25);
        person.put("location", "Charleston");
        person.remove("age");
        System.out.println(person.get(person));

        String alice = names2.get(0);
        String bob = (String) person.get("name");
    }
}
