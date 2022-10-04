/* Name: Akshya Subbaraman
* Purpose: Chapter 6 Project 1 Write a program that counts the number of words, lines, and total characters in a paper
* Pseudocode: Create New file called readFromMe.txt. Output some lines of text in the file.
Increase the word count by one everytime a new word is saved into String word.
Increase the line count by one everytime a new line is saved into String lines.
Save the length of each word to countChars and add it to the previous countChars value.
Print out countWords, countLines and countChars.
* Maintenance Log: 10/3/22 - Finished Program.   */
import java.util.*;
import java.io.*;
public class wordLineCharCounter {

 public static void main (String [] args)

            throws FileNotFoundException {

     PrintStream output = new PrintStream (new File("readFromMe.txt"));
     output.println("It means no worries\nFor the rest of your days\nIt's our problem free philosophy\nHakuna Matata!");
     Scanner input = new Scanner(new File("readFromMe.txt"));
     int countWords = 0;
     while (input.hasNext()) {
         String word = input.next();
         countWords++;
     }
     Scanner input2 = new Scanner(new File("readFromMe.txt"));
     int countLines = 0;
     while (input2.hasNextLine()) {
         String lines = input2.nextLine();
         countLines++;
     }
     Scanner input3 = new Scanner(new File("readFromMe.txt"));
     int countChars = 0;
     while (input3.hasNext()) {
         String chars = input3.next();
         countChars = chars.length() + countChars;
     }
     System.out.println("Number of Words: " + countWords);
     System.out.println("Number of Lines: " + countLines);
     System.out.println("Number of Characters: " + countChars);


 }

    }


