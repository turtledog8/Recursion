package bunnyEars2;

import java.util.Scanner;
//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
//The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
//
//Input
//On the first line you will be given the number of bunnies.
//
//Output
//On the only output line you should print the number of their ears.
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