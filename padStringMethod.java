/* Name: Akshya Subbaraman
* Purpose: CH 3 Exercise 11 Write a method called padString that accepts two parameters: a String and an integer representing a length.
The method should pad the parameter String with spaces until its length is the given length.
* Pseudocode: Get the string and length from the user. If the length of the string is less than the
desired length, add a number of spaces (desired length - string length). If the length of the string is
greater than the desired length, print out the original string.
* Maintenance Log: 10/4/22 - Finished Program.
* */
import java.util.*;
public class padStringMethod {

    public static void main (String [] args) {
        System.out.print("String: ");
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();
        System.out.print("Length: ");
        Scanner l = new Scanner(System.in);
        int length = l.nextInt();
        padString(word, length);
    }
    public static void padString(String word, int length) {

        if (word.length() < length) {
            System.out.print(word);
            for(int i = 0; i <= length - word.length(); i ++) {
                System.out.print(" ");
            }
        }
        else if (word.length() >= length) {
            System.out.println(word);
        }
    }
}


