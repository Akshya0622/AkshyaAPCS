/* Name: Akshya Subbaraman
* Purpose: Ch 3 Exercise 8. Write a method called quadratic that takes three parameters
(the coefficients of a polynomial equation) and outputs the roots.
* Pseudocode: User enters the values a, b, and c of the quadratic function.
The three values get sent to the method, quadratic, which uses the quadratic formula to print out the roots.
* Maintenance Log: 9/22/22 - Finished Program.
*/
import java.util.*;
public class Quadratic {

    public static void main(String [] args) {
        while (true) {

            System.out.print("\na value: ");
            Scanner a = new Scanner(System.in); // user enters a value
            double aa = a.nextDouble();
            System.out.print("b value: ");
            Scanner b = new Scanner(System.in); // user enters b value
            double bb = b.nextDouble();
            System.out.print("c value: ");
            Scanner c = new Scanner(System.in); // user enters c value
            double cc = c.nextDouble();

            quadratic(aa, bb, cc);
        }


    }

    public static void quadratic (double a, double b, double c) {

        if(Math.pow(b,2)-(4 * a * c) < 0) {
            System.out.println("no:(");
        }

        else if (Math.pow(b,2) - (4 * a * c) >= 0) {

            double roots1 = (-b + Math.sqrt((Math.pow(b,2))-(4 * a * c))) / (2 * a); // quadratic formula
            double roots2 = (-b - Math.sqrt((Math.pow(b,2))-(4 * a * c))) / (2 * a); // quadratic formula
            System.out.print("Roots: " + roots1 + ", " + roots2);
        }


    }
}
