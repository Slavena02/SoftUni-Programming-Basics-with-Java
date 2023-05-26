package ForLoop_Lab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = 0; i < number; i++) {

            int n = Integer.parseInt(scanner.nextLine());

            result += n;

        }
        System.out.println(result);
    }
}
