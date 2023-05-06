package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P03Time_15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sum = minutes + 15 + ( hours * 60);

        hours = sum / 60;
        minutes = sum % 60;

        if (sum > 23) {
            sum = 0;
        }
            System.out.printf("%d:%02d" , hours ,minutes );

    }
}

