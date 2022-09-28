/* Name: Akshya Subbaraman
* Purpose:
* Pseudocode: Take user input. Go into first if statement that is true for the user input number.
Add roman numerals to string and subtract from total number.
Exit if statement and loop back to the beginning and enter new if statement. Continues until number = 0.
Print out string numeral.
* Maintenance Log: 9/27/22 - Finished Program
* */
import java.util.*;
public class RomanNumerals {

    public static void main (String [] args) {
        while (true) {
            System.out.println("Number between 1 and 3999: ");
            Scanner num = new Scanner (System.in);
            int number = num.nextInt();
            String romanNumerals = "";

            if (number > 3999 || number < 1) {
                System.out.println("Pick a number between 1 and 3999");
            }

            while (number >= 1 && number <= 3999) {

                if (number >= 1000) {
                    romanNumerals = romanNumerals + "M";
                    number = number - 1000;
                }
                else if (number >= 900) {
                    romanNumerals = romanNumerals + "CM";
                    number = number - 900;
                }
                else if (number >= 500) {
                    romanNumerals = romanNumerals + "D";
                    number = number - 500;
                }
                else if (number >= 400) {
                    romanNumerals = romanNumerals + "CD";
                    number = number - 400;
                }
                else if (number >= 100) {
                    romanNumerals = romanNumerals + "C";
                    number = number - 100;
                }
                else if (number >= 90) {
                    romanNumerals = romanNumerals + "XC";
                    number = number - 90;
                }
                else if (number >= 50) {
                    romanNumerals = romanNumerals + "L";
                    number = number - 50;
                }
                else if (number >= 40) {
                    romanNumerals = romanNumerals + "XL";
                    number = number - 40;
                }
                else if (number >= 10) {
                    romanNumerals = romanNumerals + "X";
                    number = number - 10;
                }
                else if (number >= 9) {
                    romanNumerals = romanNumerals + "IX";
                    number = number - 9;
                }
                else if (number >= 5) {
                    romanNumerals = romanNumerals + "V";
                    number = number - 5;
                }
                else if (number >= 4) {
                    romanNumerals = romanNumerals + "IV";
                    number = number - 4;
                }
                else if (number >= 1) {
                    romanNumerals = romanNumerals + "I";
                    number = number - 1;
                }

            }

            System.out.println(romanNumerals);


        }

    }

}
