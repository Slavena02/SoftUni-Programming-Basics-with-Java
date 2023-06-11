package For_Loop_MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int move = Integer.parseInt(scanner.nextLine());

        int invalidNum = 0;
        int num0or9 = 0;
        int num10or19 = 0;
        int num20or29 = 0;
        int num30or39 = 0;
        int num40or50 = 0;
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
    }
}
