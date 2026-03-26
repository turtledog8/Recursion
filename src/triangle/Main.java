package triangle;

import java.util.Scanner;
//Triangle
//We have triangle made of blocks.
// The topmost row has 1 block, the next row down has 2 blocks,
// the next row has 3 blocks, and so on. Compute recursively
// (no loops or multiplication) the total number of blocks in
// such a triangle with the given number of rows.
//
//Input
//On the first line you will be given the number of rows.
//
//Output
//On the only output line you should print the total number of blocks.
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