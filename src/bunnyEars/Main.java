package bunnyEars;

import java.util.Scanner;
//Bunny Ears
//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
//
//Input
//On the first line you will be given the number of bunnies.
//
//Output
//On the only output line you should print the number of their ears.
//
//        Constraints
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