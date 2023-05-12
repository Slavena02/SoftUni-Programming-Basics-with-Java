package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String vipOrNormal = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0.00;
        double tickets = 0.00;

        switch (vipOrNormal){
            case "VIP":
                tickets = people * 499.99;
                break;
            case "Normal":
                tickets = people * 249.99;
        }
        if (people <= 4){
            transport = budget - (budget * 0.25);
        }else if ( people <= 9){
            transport = budget - (budget * 0.40);
        }else if (people <= 24){
            transport = budget - (budget * 0.50);
        }else if (people <= 49){
            transport = budget - (budget * 0.60);
        }else{
            transport = budget - (budget * 0.75);
        }


        double total = budget - transport;

        if (total >= tickets){
            System.out.printf("Yes! You have %.2f leva left." , total - tickets);

        }else {
            System.out.printf("Not enough money! You need %.2f leva." , tickets - total);
        }
    }
}
