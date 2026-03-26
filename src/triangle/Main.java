package triangle;

import java.util.Scanner;

/*
 * Triangle
 *
 * A triangle of blocks has 1 block in the top row, 2 in the next,
 * 3 in the next, and so on. Recursively compute the total number of
 * blocks for a triangle with the given number of rows
 * (no loops or multiplication).
 *
 * Input:  The number of rows.
 * Output: The total number of blocks.
 */
public class Main {

    public static int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        System.out.println(triangle(rows));
    }
}