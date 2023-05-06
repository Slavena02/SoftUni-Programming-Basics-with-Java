package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();
        int timeOneEpisode = Integer.parseInt(scanner.nextLine());
        int relaxTime = Integer.parseInt(scanner.nextLine());

        double eat = relaxTime /8.0;
        double relax = relaxTime / 4.0;

        double totalTime = relaxTime-eat-relax;
        double d = Math.ceil(Math.abs(totalTime-timeOneEpisode));

        if(totalTime >= timeOneEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name , d);
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." , name,d);
        }


    }
}
