package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int walkingMinutesDay = Integer.parseInt(scanner.nextLine());
        int walking = Integer.parseInt(scanner.nextLine());
        int caloriesOneDay = Integer.parseInt(scanner.nextLine());


        double minutesTotal = walking * walkingMinutesDay;
        double caloriesDay = minutesTotal * 5;

        double totalCaloriesOneDay = caloriesOneDay - (caloriesOneDay * 0.50);

        if (caloriesDay >= totalCaloriesOneDay){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f." , caloriesDay);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f." ,caloriesDay);
        }
    }

    public static class P01PoolDay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int people = Integer.parseInt(scanner.nextLine());
            double entranceFee = Double.parseDouble(scanner.nextLine());
            double oneDayPriceSunBed = Double.parseDouble(scanner.nextLine());
            double oneUmbrellaPrice = Double.parseDouble(scanner.nextLine());

            double entranceFeePrice = people * entranceFee;

            double peoplePercent =Math.ceil (people - (people * 0.25));
            double totalSumSunBed = peoplePercent * oneDayPriceSunBed;

            double umbrellaPercent = Math.ceil(people - (people * 0.50));

            double totalSumUmbrella = umbrellaPercent * oneUmbrellaPrice;

            double totalSumPoolDay = entranceFeePrice + totalSumSunBed + totalSumUmbrella;

            System.out.printf("%.2f lv." , totalSumPoolDay);


        }
    }

    public static class P02FamilyTrip {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            int night = Integer.parseInt(scanner.nextLine());
            double oneNightPrice = Double.parseDouble(scanner.nextLine());
            double percent = Double.parseDouble(scanner.nextLine());



            if (night > 7){
                oneNightPrice = oneNightPrice - (oneNightPrice*0.05);
            }
            double nightPrice = night * oneNightPrice;

            double percentPrice = budget * (percent/100);

            double totalSum = nightPrice + percentPrice;

            if (budget >= totalSum){
               System.out.printf("Ivanovi will be left with %.2f leva after vacation." , budget-totalSum);

            }else{
                System.out.printf("%.2f leva needed." , totalSum-budget);
            }
        }
    }
}
