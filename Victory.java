/* Name: Akshya Subbaraman
* Purpose: Chapter 1 Exercise 7 - Write a program the prints the "Victory is mine!" output.
* Pseudocode: Use a for loop to print out text from drawVictory method.
* Maintenance Log: 9/14/22- Finished Program
*/
public class Victory {
    public static void main(String[] args) {
        System.out.println("//////////////////////");
        for (int i = 0; i < 5; i++) {
            drawVictory();
        }
    }

    public static void drawVictory() {
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

    }
}
