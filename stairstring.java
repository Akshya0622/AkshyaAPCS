/* Name: Akshya Subbaraman
* Purpose: Write a method called stairString that takes a string and an integer as parameters.
The method will divide the String into the number of substrings indicated
and then output the substrings so that each substring is placed one line
below the next in the same horizontal location it would have been had they been on the same line.
* Pseudocode: Take String and int input from user and send to method stairString.
perLine calculates how many characters should be in each row and leftOver counts how many
characters will remain that would need to be added onto the last row. A number of spaces equal to the
length of the characters already printed in the previous line are printed.
A substring prints from the string at the index i, i + perLine.
Where i is incremented by the number of characters there should be perLine.
The substring prints until i reaches a value that is the length of the string - the left overs.
The left overs are added to the end of the last row.
* Maintenance Log: 10/17/22 - Misunderstood problem and made a program that prints each word in a sentence on different lines.
10/18/22 - Finished Program.
* */
import java.util.*;
public class stairstring {

    public static void main(String[] args) {

        System.out.print("String: ");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        System.out.print("Lines: ");
        int numLines = input.nextInt();

        stairString(words, numLines);

    }

    public static void stairString(String words, int numLines) {

        if (numLines > 0) {

            Scanner input = new Scanner(words);
            int perLine = words.length() / numLines;
            int leftOver = words.length() % numLines;
            int newVar = 0;

            for (int i = 0; i < words.length() - leftOver; i += perLine) {
                System.out.println();
                for (int spaces = 0; spaces < i; spaces++) {
                    System.out.print(" ");
                }
                System.out.print(words.substring(i, i + perLine));
                newVar = i;
            }

            System.out.print(words.substring(newVar + perLine, words.length()));

        }



    }
}
