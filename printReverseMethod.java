/* Name: Akshya Subbaraman
*  Purpose: Write a method called printReverse that
accepts a String as its parameter and prints the characters in opposite order
* Pseudocode: Get string from user. Take the length of the string and place it into the charAt method
to print out the last letter of the string first. The for loop reduces the length by one each time and
places each value into the charAt.
* Maintenance Log: 10/4/22 - Finished Program
* */
import java.util.*;
public class printReverseMethod {

    public static void main (String [] args) {
        System.out.print("String: ");
        Scanner s = new Scanner(System.in);
        String reverseMe = s.nextLine();

        printReverse(reverseMe);

    }

    public static void printReverse(String reverseMe) {

        for (int i = reverseMe.length() - 1; i >= 0; i--) {
            System.out.print(reverseMe.charAt(i));
        }
    }
}
