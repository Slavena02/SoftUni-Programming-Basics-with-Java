package WhileLoop_Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        double money = 0;
        while (!input.equals("NoMoreMoney")) {

            System.out.println(input);
            double output = Double.parseDouble(input);
            money += output;
            if (output <= 0) {
                System.out.println("Invalid operation!");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",money);
    }
}
