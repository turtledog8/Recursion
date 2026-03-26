package sumDigits;
import java.util.Scanner;

/*
 * Sum of Digits
 *
 * Given a four-digit number, recursively compute the sum of its digits.
 *
 * Input:       A four-digit integer N.
 * Output:      The sum of its digits.
 * Constraints: 1000 <= N <= 9999
 *
 * Examples:
 *   1213 → 1 + 2 + 1 + 3 = 7
 *   2346 → 2 + 3 + 4 + 6 = 15
 */
public class Main {

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumDigits(n));
    }
}