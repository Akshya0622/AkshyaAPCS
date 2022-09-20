/* Name: Akshya Subbaraman
* Purpose: Chapter 2 Exercise 3. Write a for loop that computes the first 12 Fibonacci numbers
* Pseudocode:
                firstNum = 1 secondNum = 0
                (i = 1) fib = firstNum + secondNum = 1 + 0 = 1
                firstNum = secondNum; firstNum = 0. secondNum = fib; secondNum = 1.
                * print out 1 (fib)
                (i = 2) fib = 0 + 1 = 1
                firstNum = 1, secondNum = 1.
                * print out 1 (fib)
                (i = 3) fib = 1 + 1 = 2
                firstNum = 1, secondNum = 2.
                * print out 2 (fib)
                (i = 4) fib = 1 + 2 = 3
                firstNum = 2, secondNum = 3.
                * print out 3 (fib)
                .....
                (i = 12) fib = 55 + 89 = 144
                * print out 144 (fib)
* Maintenance Log: 9/20/22 - Finished Program


* */
public class FibonacciSeries {

    public static void main(String[] arg) {
        int firstNum=1;
        int secondNum=0;

        for (int i = 1; i <13; i++) {

            int fib = firstNum + secondNum;
            firstNum= secondNum;
            secondNum = fib;
            System.out.println(fib);

            }
        }
    }



