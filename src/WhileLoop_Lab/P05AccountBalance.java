package WhileLoop_Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("NoMoreMoney")){
            double many = Integer.parseInt(scanner.nextLine());
            System.out.printf("Increase:%f " , many);
            sum += many;
        }
        System.out.printf("Total: %f" , input);
        }

}
