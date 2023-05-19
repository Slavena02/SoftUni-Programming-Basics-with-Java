package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double sportPrice = 0.00;


        switch (gender) {
            case "m":
                switch (sport) {
                    case "Gym":
                        sportPrice = 42.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Boxing":
                        sportPrice = 41.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Yoga":
                        sportPrice = 45.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Zumba":
                        sportPrice = 34.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Dances":
                        sportPrice = 51.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Pilates":
                        sportPrice = 39.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                }
                break;
            case "f":
                switch (sport) {
                    case "Gym":
                        sportPrice = 35.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Boxing":
                        sportPrice = 37.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Yoga":
                        sportPrice = 42.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Zumba":
                        sportPrice = 31.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Dances":
                        sportPrice = 53.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                    case "Pilates":
                        sportPrice = 37.00;
                        if (age <= 19) {
                            sportPrice = sportPrice - (sportPrice * 0.20);
                        }
                        break;
                }
                break;
        }
        if (budget >= sportPrice){
            System.out.printf("You purchased a 1 month pass for %s." , sport);
        }else{
            System.out.printf("You don't have enough money! You need $%.2f more.", sportPrice - budget);
        }
    }
}

