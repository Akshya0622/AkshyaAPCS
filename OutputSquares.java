/* Name: Akshya Subbaraman
* Purpose: Chapter 2 Exercise 2. Output squares of numbers 1-10
* Pseudocode:
     i = 1, { j = 0, x = 0 + 0 + (0 + 1) = 1 } -> exit j loop (still inside i loop), print out 1.
     i = 2, { j = 1, x = 1 + 1 + (1 + 1) = 4 } -> exit j loop (still inside i loop), print out 4.
     i = 3, { j = 2, x = 4 + 2 + (2 + 1) = 9 } -> exit j loop (still inside i loop), print out 9.
     i = 4, { j = 3, x = 9 + 3 + (3 + 1) = 16 } -> exit j loop (still inside i loop), print out 16.
     ...
     i = 10, { j = 9, x = 81 + 9 + (9 + 1) = 100 } -> exit j loop, print out 100. Exit i loop.

* Maintenance Log: 9/19/22 - Finished Program
*/
public class OutputSquares {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            int x = 0;

            for (int j = 0; j < i; j++) {
                x = x + j + (j + 1);

            }
            System.out.println(x);
        }
    }
}



