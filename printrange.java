/* Name: Akshya Subbaraman
* Purpose: Write a method called printRange that accepts two integers as arguments and
prints the sequence of numbers between the two arguments, enclosed in square brackets
* Pseudocode: User inputs number1 and number2. If number1 < number 2:  Use for loop to print
number1 + 1 until it reaches number2. If number1 > number2: Use for loop to print
number1 - 1 until it reaches number2.
* Maintenance Log: 9/26/22 - Finished Program
* */
import java.util.*;
public class printrange {

    public static void main(String [] args) {
        System.out.print("First Number: ");
        Scanner n1 = new Scanner(System.in);
        int number1 = n1.nextInt();
        System.out.print("Second Number: ");
        Scanner n2 = new Scanner(System.in);
        int number2 = n2.nextInt();

        printRange(number1, number2);

    }

    public static void printRange (int number1, int number2) {
        if (number1 < number2) {
            System.out.print("{");
            for (int i = number1; i < number2; i++ ) {
                System.out.print(i);
                System.out.print(", ");
            }
            System.out.print(number2);
            System.out.print("}");
        }
        else if (number1 > number2) {
            System.out.print("{");
            for (int i = number1; i > number2; i--) {
                System.out.print(i);
            }
            System.out.print(number2);
            System.out.print("}");
        }
        else {
            System.out.print("{" + number1 + "}");
        }
    }

}
