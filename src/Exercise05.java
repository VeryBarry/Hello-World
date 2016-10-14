/**
 * Created by VeryBarry on 10/11/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;

        while (num != 0) {
            reversed = reversed * 10;
            reversed = reversed + num % 10;
            num = num / 10;
        }
        System.out.println(reversed);
    }
}
