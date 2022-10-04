/* Name: Akshya Subbaraman
* Purpose: CH 5 Exercise 5. Write a method called randomLines that prints between 5 and 10 random strings of letters.
Each string should have a random length of up to 80 characters.
* Pseudocode: rand5to10() returns a random value between 5 and 10.
This value is called in the first for loop which determines how many lines of output there will be.
rand0to80() returns a random value between 0 and 80. This value is called in the second for loop
which determines how many times a letter should be printed out per line.
randLetters() returns a random value between 0 and 26.
This value is used to save a random letter to char letter from string alphabet, using charAt().
char letter is printed out a number of times between 0 and 80.
* Maintenance Log: 9/28/22 - Made each method. 9/30/22 - Called each method to the for loops in main.
*/
import java.util.*;
public class randomlines {

    public static void main (String [] args) {

        for (int i = 0; i <= rand5to10(); i++) {
            for(int j = 0; j < rand0to80(); j++) {
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                char letter = alphabet.charAt(randLetters());
                System.out.print(letter);
            }
            System.out.println();
        }


    }

    public static int rand5to10() {

        Random r1 = new Random();
        int result = r1.nextInt(5) + 5;
        return result;
    }
    public static int randLetters() {
        Random l = new Random();
        int result = l.nextInt(26);
        return result;
    }
    public static int rand0to80 () {
        Random r1 = new Random();
        int result = r1.nextInt(81);
        return result;
    }
}
