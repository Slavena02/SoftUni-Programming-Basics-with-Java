package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double many = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ramMemory1 = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCard * 250;
        double processorPrice = processor*(videoCardPrice*0.35);
        double ramMemoryPrice = ramMemory1*(videoCardPrice * 0.10);

        double totalSum =  videoCardPrice + processorPrice + ramMemoryPrice;

        if(videoCard > processor){
            totalSum = totalSum * 0.85 ;
        }

        double d = Math.abs(totalSum - many);

        if (many >= totalSum){
            System.out.printf("You have %.2f leva left!" , d);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!" , d);
        }


    }

    }


