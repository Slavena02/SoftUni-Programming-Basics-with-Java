package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class P02FamilyTrip {
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
