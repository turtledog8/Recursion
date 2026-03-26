package Fibonacci;
import java.util.Scanner;

/*
 * Fibonacci
 *
 * The Fibonacci sequence starts with 0 and 1; each subsequent value is
 * the sum of the previous two: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * Recursively return the nth Fibonacci number, where n=0 is the start.
 *
 * Input:       A non-negative integer n.
 * Output:      The nth Fibonacci number.
 * Constraints: n >= 0
 */
public class Main {

    public static long fibonacci(int n) {
        return fibHelper(n, 0, 1);
    }

    public static long fibHelper(int n, long a, long b) {
        if (n == 0) return a;
        if (n == 1) return b;

        return fibHelper(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
}