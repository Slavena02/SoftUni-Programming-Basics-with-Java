package WhileLoop_Lab;

import java.util.Scanner;

public class P04Sequence2K1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int input = 1;
        while (input <= n) {
            System.out.println(input);
            input = input * 2 + 1;
        }
    }
}
