import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by VeryBarry on 9/26/16.
 */
public class exercise04 {

    public static void main(String[] args) {
        String[] names = {"charlie", "david", "bob", "alice", "andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
        //sortedNames must contain the names sorted alphabetically
        for (String name : names){
            int index = 0;
          //find the correct index
            for (String sortedname : sortedNames){
                if(name.compareTo(sortedname) > 0){
                    index++;
                }
                else{
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);

    }
}
