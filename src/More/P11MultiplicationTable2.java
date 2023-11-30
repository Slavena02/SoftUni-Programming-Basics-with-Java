package More;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0 ;
        for (int i = 1; i <=num1 ; i++) {
            for (int j = 1; j <=num2 ; j++) {
             sum = num1 * num2;
            }
        }
        System.out.println(num1 + " X " + num2 + " = " + sum);
    }
}
