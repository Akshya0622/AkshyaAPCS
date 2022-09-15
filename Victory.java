/* Name: Akshya Subbaraman
* Purpose: Chapter 1 Exercise 7- Write a program the prints the "Victory is mine!" output.
* Psuedocode: Use a for loop to print out text from drawvictory method.
* Maintanence Log: 9/14/22- Finished Program */
public class Victory {
    public static void main(String[] args) {
        System.out.println("//////////////////////");
        for (int i=0; i<5; i++) {
            drawvictory();
        }

    }

    public static void drawvictory()
    {

        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

    }
}
