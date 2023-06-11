package For_Loop_MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int move = Integer.parseInt(scanner.nextLine());

        double invalidNum = 0;
        double num0or9 = 0;
        double num10or19 = 0;
        double num20or29 = 0;
        double num30or39 = 0;
        double num40or50 = 0;
        double sumPoint = 0;


        for (int i = 1; i <= move ; i++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (points< 0 || points > 50){
                sumPoint /= 2;
                invalidNum ++;
            }else if (points <=9){
                sumPoint = sumPoint + (points * 0.20);
                num0or9++;
            }else if (points <=19){
                sumPoint = sumPoint + (points * 0.30);
                num10or19++;
            }else if(points <= 29){
                sumPoint = sumPoint + (points * 0.40);
                num20or29++;
            }else if (points <= 39){
                sumPoint += 50;
                num30or39++;
            }else {
                sumPoint += 100;
                num40or50++;
            }

        }
        System.out.printf("%.2f%n",sumPoint);
        System.out.printf("From 0 to 9: %.2f%%%n" ,num0or9 / move * 100);
        System.out.printf("From 10 to 19: %.2f%%%n" , num10or19 / move * 100);
        System.out.printf("From 20 to 29: %.2f%%%n" , num20or29 / move * 100);
        System.out.printf("From 30 to 39: %.2f%%%n" , num30or39 / move * 100);
        System.out.printf("From 40 to 50: %.2f%%%n" , num40or50 / move * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNum  / move * 100);
    }
}
