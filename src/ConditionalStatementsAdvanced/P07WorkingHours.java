package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
       } else {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
           System.out.println("closed");
            }
        }
        }
    }

