package bunnyEars;

import java.util.Scanner;

/*
 * Bunny Ears
 *
 * We have a number of bunnies and each bunny has two big floppy ears.
 * Compute the total number of ears across all bunnies recursively
 * (without loops or multiplication).
 *
 * Input:  The number of bunnies.
 * Output: The total number of ears.
 */
public class Main {

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bunnies = scanner.nextInt();

        System.out.println(bunnyEars(bunnies));
    }
}