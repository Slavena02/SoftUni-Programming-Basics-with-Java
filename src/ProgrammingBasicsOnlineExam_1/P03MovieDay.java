package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P03MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double time = Double.parseDouble(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timeOfScenes = Integer.parseInt(scanner.nextLine());

        double preparation = time * 0.15;
        double sumScenes = scenes * timeOfScenes;
        double total = preparation + sumScenes;

        if (total <= time){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!" , time - total);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes." ,total - time);
        }



    }
}
