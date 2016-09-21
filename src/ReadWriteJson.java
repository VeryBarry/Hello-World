import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.*;

/**
 * Created by VeryBarry on 9/21/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Barry Daniels", 25, true);
        File f = new File("person.json");

        //how to write a json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(p);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //read json
        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents, 0, fileSize);
        JsonParser parser = new JsonParser();
        Person p2 = parser.parse(contents, Person.class);
        System.out.println(p2);
    }
}
