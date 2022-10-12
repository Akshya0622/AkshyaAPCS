/* Name: Akshya Subbaraman
* Purpose: CH 3 Exercise 15. Write a method called processName that accepts a Scanner for the console as a parameter
and prompts the user to enter a full name then prints out the name in reverse order.
* Pseudocode: User enters name. Scanner is passed as a parameter into method processName.
Input from scanner is converted into a string and the string is read by scanner namess.
While loop counts the number of words in the string and saves the last word into String last.
For loop adds every word to String everythingButLast except the last word.
Output last, everythingButLast.
* Maintenance Log: 10/5/22 - Found way to print out first and last name if there are only two words
10/7/22 - Retrieved last word from name 10/10/22 - Retrieved every other word from name
*/
import java.util.*;
public class processNameMethod {

    public static void main (String [] args) {

        System.out.print("What is your first and last name");
        Scanner console = new Scanner(System.in);

        processName(console);
    }
    public static void processName (Scanner sc) {

        String name = sc.nextLine();
        Scanner namess = new Scanner(name);
        String last = " ";
        int count = 0;
        while (namess.hasNext()) {
            last = namess.next();
            count++;
        }
        System.out.print(last + ", ");
        Scanner namess2 = new Scanner(name);
        String everythingButLast = " ";
        for (int i = 1; i < count; i++) {
            everythingButLast = namess2.next();
            System.out.print(everythingButLast + " ");
        }



   }
}
