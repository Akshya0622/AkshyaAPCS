/* Name: Akshya Subbaraman
* Purpose: Ch 3 Project 4. Write a program that prompts for the three sides of a triangle and reports the three angles.
* Pseudocode: User enters the length of each side a, b, and c which get sent into the angles method.
The angles method uses the law of cosines to compute the three angles (in radians) and prints these values out.
If the two smaller sides added together are not greater than the length of the longest side, print "not a triangle"
* Maintenance Log: 9/22/22 - Finished Program
*/
import java.util.*;
public class Triangle {
    public static void main (String [] args) {

        System.out.print("Side 1 length: ");
        Scanner a = new Scanner(System.in);
        double sideA = a.nextDouble();
        System.out.print("Side 2 length: ");
        Scanner b = new Scanner(System.in);
        double sideB = b.nextDouble();
        System.out.print("Side 3 length: ");
        Scanner c = new Scanner(System.in);
        double sideC = c.nextDouble();

        angles(sideA, sideB, sideC);
    }

    public static void angles(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideC > sideB && sideC > sideA) {

            double angleA = Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
            double angleB = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
            double angleC = Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB));

            System.out.print("Angle 1: " + angleA + " Angle 2: " + angleB + " Angle 3: " + angleC );

        }
        else if (sideA + sideC > sideB && sideB > sideA && sideB > sideC) {

            double angleA = Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
            double angleB = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
            double angleC = Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB));

            System.out.print("Angle 1: " + angleA + " Angle 2: " + angleB + " Angle 3: " + angleC );
        }
        else if (sideB + sideC > sideA && sideA > sideB && sideA > sideC) {

            double angleA = Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
            double angleB = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
            double angleC = Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB));

            System.out.print("Angle 1: " + angleA + " Angle 2: " + angleB + " Angle 3: " + angleC );
        }
       else {

           System.out.println("not a triangle");
        }
    }
}



