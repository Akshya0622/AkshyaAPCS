/* Name: Akshya Subbaraman
* Purpose: Write a method that takes a string and an integer (maximum length)
and outputs the necessary substrings of the given length
* Pseudocode: User inputs String and maximum length of substring.
Within for loop i is incremented by the maxLength number.
While i + maxLength is less than the length of the string, print out the substring from i to i + maxLength
Once the length of i + maxLength exceeds the length of the string, just print out the remaining characters.
* Maintenance Log: 10/12/22 - Finished Program
* */
import java.util.*;
public class subStrings {
    public static void main (String [] args) {

        Scanner u = new Scanner(System.in);
        System.out.print("String: ");
        String userInput = u.nextLine();
        System.out.print("Max Length: ");
        int maxLength = u.nextInt();

        substrings(userInput, maxLength);

    }

    public static void substrings(String userInput, int maxLength) {


        for (int i = 0; i <= userInput.length(); i += maxLength) {

            if (i + maxLength <= userInput.length()) {

               System.out.println(userInput.substring(i, i + maxLength));
           }

            else if (i + maxLength > userInput.length()) {
               for (int j = i; j < userInput.length(); j++) {

                   System.out.print(userInput.charAt(j));
               }


           }

        }
    }
}
