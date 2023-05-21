package ForLoop_Lab;

import java.util.Scanner;

public class P02NumbersN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int num = number; num>=1 ; num--){
            System.out.println(num);

        }
    }
}
