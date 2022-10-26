/* Name: Akshya Subbaraman
* Purpose: Use a two-dimensional array to write a game of Tic-Tac-Toe that represents the board
* Pseudocode: if there are three X's in a row, column or diagonal in the array tic, print out "you have won"
if there are three O's in a row, column or diagonal in the array tic, print our "I have won".
if no one has won yet ask the user to pick a box and enter a row and column.
Convert the user input into a row and column value and apply that to the array.
If the array already has a char in that location print out "That spot is filled. Try again".
Else, add an X to that location in the array. Get random row and column values from the methods
myMoveRow and myMoveColumn. If the random location is filled, keep calling the method until the returned
values are of a location that is not filled. Then save an "O" in the location.
Repeat this process until there is either a winner or all the slots are filled and there is no winner.
* Maintenance Log: 10/21/22- Asked for user input and found ways to save it into the vector and made
 if statements to read winner from vector 10/24/22- Made methods for myMove
* */
import java.util.*;
public class TicTacToe {
    public static void main (String [] args) {
        char[][] tic = new char [3][3];
        boolean winner = false;
        System.out.println("Let's play Tic Tac Toe.");

        while(winner != true) {


            if
            (tic[0][0] == 'X' && tic[0][1] == 'X' && tic[0][2] == 'X'||
             tic[1][0] == 'X' && tic[1][1] == 'X' && tic[1][2] == 'X'||
             tic[2][0] == 'X' && tic[2][1] == 'X' && tic[2][2] == 'X'||
             tic[0][0] == 'X' && tic[1][0] == 'X' && tic[2][0] == 'X'||
             tic[0][1] == 'X' && tic[1][1] == 'X' && tic[2][1] == 'X'||
             tic[0][2] == 'X' && tic[1][2] == 'X' && tic[2][2] == 'X'||
             tic[0][0] == 'X' && tic[1][1] == 'X' && tic[2][2] == 'X'||
             tic[0][2] == 'X' && tic[1][1] == 'X' && tic[2][0] == 'X')
            {
                System.out.println("You have won.");
                winner = true;

            }

            else if
            (tic[0][0] == 'O' && tic[0][1] == 'O' && tic[0][2] == 'O'||
             tic[1][0] == 'O' && tic[1][1] == 'O' && tic[1][2] == 'O'||
             tic[2][0] == 'O' && tic[2][1] == 'O' && tic[2][2] == 'O'||
             tic[0][0] == 'O' && tic[1][0] == 'O' && tic[2][0] == 'O'||
             tic[0][1] == 'O' && tic[1][1] == 'O' && tic[2][1] == 'O'||
             tic[0][2] == 'O' && tic[1][2] == 'O' && tic[2][2] == 'O'||
             tic[0][0] == 'O' && tic[1][1] == 'O' && tic[2][2] == 'O'||
             tic[0][2] == 'O' && tic[1][1] == 'O' && tic[2][0] == 'O')
            {
                System.out.println("I have won *_*");
                winner = true;
            }


            else {

                System.out.println("Pick a box.");
                System.out.print("Enter a row: ");
                Scanner pos = new Scanner(System.in);
                int row = pos.nextInt();
                System.out.print("Enter a column: ");
                int column = pos.nextInt();

                if (tic[row - 1][column - 1] == 'X' || tic[row - 1][column - 1] == 'O') {
                    System.out.println("That spot is filled. Try again");
                }
                else {

                    tic[row - 1][column - 1] = 'X';

                    int myrow = myMoveRow();
                    int mycolumn = myMoveColumn();


                    if (tic[myrow][mycolumn] == 'X' || tic[myrow][mycolumn] == 'O') {
                        while (tic[myrow][mycolumn] == 'X' || tic[myrow][mycolumn] == 'O') {
                            myrow = myMoveRow();
                            mycolumn = myMoveColumn();
                        }
                        tic[myrow][mycolumn] = 'O';
                        System.out.println("I have placed an O in row " + (myrow + 1) + " column " + (mycolumn + 1) + " ");
                    }
                    else {
                        tic[myrow][mycolumn] = 'O';
                        System.out.println("I have placed an O in row " + (myrow + 1) + " column " + (mycolumn + 1) + " ");
                    }

                }


            }

            int count = 0;

            for(int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (tic[row][col] != 'X' && tic[row][col] != 'O') {
                        count++;

                        if (count == 9) {
                            System.out.println("Draw.");
                            break;
                        }

                    }

                }
            }
        }



    }

    public static int myMoveRow() {
        Random pos = new Random();
        int row = pos.nextInt(0,3);
        return row;
    }

    public static int myMoveColumn() {
        Random pos = new Random();
        int column = pos.nextInt(0,3);
        return column;
    }
}

