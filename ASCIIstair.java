/* Name: Akshya Subbaraman
* Purpose: Ch 2 Project 4. Write a program that produces the ASCII stair output.
Use a class constant to make it possible to change the number of stairs in the figure.
* Pseudocode: Line loop controls the number of times the stairs are constructed.
Spaces loop creates a number of spaces so that the head and stars get printed at the correct location.
The spaces loop is repeatedly used to push the star for the back of the staircase and to push the person, and each individual step.
The horizontal line loop prints out the bottom of the staircase at a length that encompasses the entire staircase.
* Maintenance Log: 9/20/22- Got 7 stars for each stair printed out using for loops.
9/21/22- Printed out person and the long vertical line for the back of the staircase by editing the space count.
*/
public class ASCIIstair {
    public static final int stairCase = 7; // class constant controls the number of stairs

    public static void main(String[] args) {
        for (int line = stairCase; line >= 1; line--) {
            System.out.println();

            for (int spaces = 0; spaces <= (7 * line); spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.print("  O   "); // prints out head
            for (int star = 1; star <= 7; star++) {
                System.out.print("*");
            } // prints out 7 stars for steps
            for (int spaces = 0; spaces <= (7 * (stairCase-line)) - 1; spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.println("*"); // prints out single star for the long vertical line that makes the back of the stairs


            for (int spaces = 0; spaces <= (7 * line); spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.print(" /|\\  *"); // prints out body and arms
            for (int spaces = 0; spaces <= 7 * (stairCase - line + 1) - 2 ; spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.println("*"); // prints out single star for the long vertical line that makes the back of the stairs


            for (int spaces = 0; spaces <= (7 * line); spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.print(" / \\  *"); // prints out legs
            for (int spaces = 0; spaces <= 7 * (stairCase - line + 1) - 2 ; spaces++) {
                System.out.print(" ");
            } // prints out spaces
            System.out.print("*"); // prints out single star for the long vertical line that makes the back of the stairs

        } // repeats "line" number of times to produce "line" number of stairs.

        System.out.println();

        for (int spaces = 0; spaces <= 7; spaces++) {
            System.out.print(" ");
        } // prints out spaces

        for(int horizontalLine = 0; horizontalLine <= (7 * stairCase) + 6 ; horizontalLine++) {
            System.out.print("*");
        } // prints out horizontal line for the bottom of the staircase

    }

}


