import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by VeryBarry on 9/21/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "daniel", "andrew", "alex"};

        ArrayList<String> namesArr;

        namesArr = new ArrayList<>(Arrays.asList(names));
        for(String name : names){
            if(name.charAt(0) == 'a')
            namesArr.remove(name);
        }
        System.out.println(namesArr);

        namesArr = new ArrayList<>(Arrays.asList(names));
        for(int i = namesArr.size() - 1; i >= 0; i++) {
            if (namesArr.get(i).charAt(0) == 'a'){
                namesArr.remove(i);
            }
        }

        namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.charAt(0) == 'a'){
                iter.remove();
            }
        }
    }
}
