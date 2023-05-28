package ForLoop_Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n  = Integer.parseInt(scanner.nextLine());

        int big = Integer.MIN_VALUE;
        int small  = Integer.MAX_VALUE;

        for (int i = 1; i <= n ; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num < small){
                small = num;
            }
            if (num > big){
                big = num;
            }
        }

        System.out.printf("Max number: %d%n", big);
        System.out.printf("Min number: %d",small);

    }
}
