package More;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int num1 = 1; num1 <= num; num1++) {

            if (num1 % 2 == 1) {
                sum += num1;
                System.out.println(num1);
            }
        }
        System.out.println(sum);
    }
}