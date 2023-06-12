package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSerial = Integer.parseInt(scanner.nextLine());


        double sum = 0.00;
        String input = scanner.nextLine();
        for (int i = 1; i <=countSerial ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            switch (input){
                case "Thrones":
                    price -= price * 0.50;
                    sum += price;
                    break;
                case "Lucifer":
                    price -= price * 0.40;
                    sum += price;
                    break;
                case "Protector":
                    price -= price * 0.30;
                    sum += price;
                    break;
                case "TotalDrama":
                    price -= price * 0.20;
                    sum += price;
                    break;
                case "Area":
                    price -= price * 0.10;
                    sum += price;
                    break;
            }
            budget -= price;
            sum += price;
            if (budget < sum){
                break;
            }
            input = scanner.nextLine();


        }
        if (budget >= sum){
            System.out.printf("You bought all the series and left with %.2f lv." , budget - sum);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!" , sum - budget);
        }

    }
}
