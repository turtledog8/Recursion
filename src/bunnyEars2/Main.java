package bunnyEars2;

import java.util.Scanner;

/*
 * Bunny Ears 2
 *
 * Bunnies stand in a line numbered 1, 2, 3, ...
 * Odd-numbered bunnies have 2 ears; even-numbered bunnies have 3 ears.
 * Recursively return the total number of ears for bunnies 1 through n
 * (without loops or multiplication).
 *
 * Input:  The number of bunnies (n).
 * Output: The total number of ears.
 */
public class Main {

    public static int bunnyEars2(int n) {
        if (n == 0) return 0;

        if (n % 2 == 0) {
            return 3 + bunnyEars2(n - 1);
        } else {
            return 2 + bunnyEars2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(bunnyEars2(n));
    }
}