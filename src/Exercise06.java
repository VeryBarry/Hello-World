/**
 * Created by VeryBarry on 10/14/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        isPalindrome("racecar");
        isPalindrome("hello");
    }
    public static boolean isPalindrome(String str) {
        if(str.equals(new StringBuffer().append(str).reverse().toString())) {
            System.out.println("This is a palindrome.");
            return true;
        }
        else {
            System.out.println("This is not a palindrome.");
            return false;
        }
    }
}