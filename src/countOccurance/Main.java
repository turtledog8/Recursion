package countOccurance;

import java.util.Scanner;

/*
 * Count Occurrences of 7
 *
 * Given a non-negative integer n, recursively count how many times
 * the digit 7 appears (no loops).
 *
 * Hint: (n % 10) gives the rightmost digit; (n / 10) removes it.
 *
 * Input:       A non-negative integer n.
 * Output:      The count of 7s in n.
 * Constraints: n >= 0
 *
 * Examples:
 *   717 → 2
 *   7   → 1
 */
public class Main {

    public static int count7(int n) {
        if (n == 0) return 0;

        int lastDigit = n % 10;

        if (lastDigit == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(count7(n));
    }
}