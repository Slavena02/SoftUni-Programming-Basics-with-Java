package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);


        double many = Double.parseDouble(scanner.nextLine());
        int actor = Integer.parseInt(scanner.nextLine());
        double outfitOneActor = Double.parseDouble(scanner.nextLine());

        double decor  = many * 0.1;

        double allActorOutfit = actor * outfitOneActor;

        if (actor >= 150){
            allActorOutfit = allActorOutfit - (allActorOutfit * 0.1);

        }
        double moviePrice = allActorOutfit + decor;

        if (moviePrice > many){
            System.out.printf("Not enough money!%n Wingard needs %.2f leva more." , moviePrice - many);

        }else{
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left." ,  many - moviePrice);

        }
    }
}
