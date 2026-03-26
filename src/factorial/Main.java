package factorial;

import java.util.Scanner;

/*
 * Factorial
 *
 * Given a positive integer n, recursively compute n! (n factorial).
 * n! = n * (n-1) * (n-2) * ... * 1
 *
 * Input:  A positive integer n.
 * Output: The value of n!.
 */
public class Main {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }
}

