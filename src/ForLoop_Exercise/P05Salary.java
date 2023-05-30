package ForLoop_Exercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabN = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());


        for (int i = 1; i <= tabN; i++) {
            String openTab = scanner.nextLine();
            switch (openTab) {
                case "Facebook":
                    salary -= 150.00;
                    break;
                case "Instagram":
                    salary -= 100.00;
                    break;
                case "Reddit":
                    salary -= 50.00;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }

}