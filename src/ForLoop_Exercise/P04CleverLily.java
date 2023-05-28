package ForLoop_Exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int lilyAge = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double birthdayMoney = 0.00;
        int sumToys = 0;


        for (int i = 1; i <= lilyAge ; i++) {
            if (i % 2 == 0){
                //парите който получава
                 birthdayMoney += (i * 5 - 1); // закономерност

            }else{
                //увеличаваме броя на играчките
                sumToys++;

            }

        }
        birthdayMoney += sumToys * toyPrice;

        if (birthdayMoney >= laundryPrice){
            double diff = birthdayMoney - laundryPrice;
            System.out.printf("Yes! %.2f" , diff);
        }else {
            double diff2 = laundryPrice - birthdayMoney;
            System.out.printf("No! %.2f" , diff2);
        }
    }
}
