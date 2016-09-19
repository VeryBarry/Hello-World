import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by VeryBarry on 9/19/16.
 */
public class exercise01 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "david", "alex", "beth"};
        // "A" : ["alice", "alex"]
        // "B" : ["bob", "beth"]
        // "C" : ["charlie"]
        // "D" : ["david"]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();

        // "A" : []
        // "B" : []
        // "C" : []
        // "D" : []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            nameMap.put(firstLetter, new ArrayList<String>());
        }
        System.out.println(nameMap);

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            arr.add(name);
        }
        System.out.println(nameMap);

        // alt solution
        nameMap.clear();

        for(String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            if (arr == null) {
                arr = new ArrayList<>();
            }
            arr.add(name);
            nameMap.put(firstLetter, arr);
        }
        System.out.println(nameMap);
    }
}
