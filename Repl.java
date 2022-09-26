/* Name: Akshya Subbaraman
* Purpose: Write a method called repl that accepts a String and a number of
repetitions as parameters and returns the string concatenated that many times.
* Pseudocode: User inputs string and number of repetitions.
Method repl uses a for loop to print out string "word" int "reps" number of times.
* Maintenance log: 9/25/22 - Finished program.
* */
import java.util.*;
public class Repl {
    public static void main (String[]args) {

        System.out.print("String? : ");
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();
        System.out.print("Repetitions? : ");
        Scanner r = new Scanner(System.in);
        int reps = r.nextInt();

        repl(word,reps);
    }

    public static void repl(String word, int reps) {
        for(int i = 0; i<reps; i++ ) {

            System.out.print(word);
        }
    }
}
