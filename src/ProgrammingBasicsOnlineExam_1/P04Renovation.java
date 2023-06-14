package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());


         int sum = h * width * 4;
         sum -= sum * 0.10;

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);

                sum -= liters;
                if (sum == 0) {
                    break;
                }
                input = scanner.nextLine();

        }
    }
}
