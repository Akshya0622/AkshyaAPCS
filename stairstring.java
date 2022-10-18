/* Name: Akshya Subbaraman
* Purpose: Write a method called stairString that takes a string and an integer as parameters.
The method will divide the String into the number of substrings indicated
and then output the substrings so that each substring is placed one line
below the next in the same horizontal location it would have been had they been on the same line.
* */
import java.util.*;
public class stairstring {

    public static void main (String [] args) {

        System.out.print("String: ");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        System.out.print("Lines: ");
        int numLines = input.nextInt();

        stairString(words, numLines);

    }

    public static void stairString(String words, int numLines) {

        Scanner input = new Scanner(words);

        int count = 0;
        String last = "";
        while (input.hasNext()) {
            last = input.next();
            count++;
        }

        String everythingButLast = "";
        Scanner input2 = new Scanner(words);
        for (int i = 1; i < count; i++) {
            everythingButLast += input2.next();
            everythingButLast += " ";
        }

        String spaces = "";
        for(int i = 0; i <= everythingButLast.length(); i++) {
            spaces += " ";
        }

        System.out.print(words.substring(0,everythingButLast.length()));
        for (int i = 0; i < numLines; i++) {
            System.out.println();
        }
        System.out.print(spaces + last);
    }
}
