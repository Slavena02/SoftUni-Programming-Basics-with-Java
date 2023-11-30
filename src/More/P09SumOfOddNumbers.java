package More;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());

        int next = 1 ;
        int sum = 0;

        for (int num1 = 1; num1 <= n; num1++) {
            System.out.println(next);
            sum +=next;
            next += 2;

        }
            System.out.println(sum);

    }
}