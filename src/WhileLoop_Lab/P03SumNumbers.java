package WhileLoop_Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int input = 0;

        while (input < number){
            int n = Integer.parseInt(scanner.nextLine());
            input += n;
        }
        System.out.println(input);
    }
}
