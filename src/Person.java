/**
 * Created by VeryBarry on 9/12/16.
 */
public class Person implements Comparable{
    String name;
    int age;
    boolean isAlive;

    static int minimumAge = 18;

    Person(){

    }

    Person(String newName, int newAge, boolean newIsAlive) {
        setName(newName);
        setAge(newAge);
        setIsAlive(newIsAlive);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public static int getMinimumAge() {
        return minimumAge;
    }

    public static void setMinimumAge(int minimumAge) {
        Person.minimumAge = minimumAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.name.compareTo(p.name);
    }
}

//    String getName() {
//        return name;
//    }
//
//    void setName(String newName) {
//        if (isValidName(newName)) {
//            name = newName;
//        }
//    }
//
//    int getAge() {
//        return age;
//    }
//
//    void setAge(int newAge) {
//        if (newAge >= minimumAge) {
//            age = newAge;
//        }
//    }
//
//    boolean getIsAlive() {
//        return isAlive;
//    }
//
//    void setIsAlive(boolean newIsAlive) {
//        if (age > 100) {
//            isAlive = false;
//        }
//        else {
//            isAlive = newIsAlive;
//        }
//    }
//
//    static boolean isValidName(String name) {
//        return name.contains(" ");
//    }
//}