package More;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = num2; i <=10 ; i++) {
            sum = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + sum);
            num2++;
        }
        if(num2 > 10){
            sum = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + sum);
        }


    }
}
