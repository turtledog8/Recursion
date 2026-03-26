package countOccurance2;

import java.util.Scanner;

/*
 * Count Occurrences of 8
 *
 * Given a non-negative integer n, recursively count how many times
 * the digit 8 appears (no loops). An 8 that has another 8 immediately
 * to its left counts double — so 8818 yields 4.
 *
 * Hint: (n % 10) gives the rightmost digit; (n / 10) removes it.
 *
 * Input:  A non-negative integer n.
 * Output: The weighted count of 8s in n.
 */
public class Main {

    public static int count8(int n) {
        if (n == 0) return 0;

        int last = n % 10;
        int next = (n / 10) % 10;

        if (last == 8) {
            if (next == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }

        return count8(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(count8(n));
    }
}