package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int needed = 0;

        String input = scanner.nextLine();
        while (!input.equals("Tired!")){
            int liters = Integer.parseInt(scanner.nextLine());
            if (sum == 0){
                break;
            }
            sum = h * width * 4;
            sum -= sum * 0.10;

            sum = sum - liters;
            input = scanner.nextLine();

        }
        
    }
}
