package More;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <=  number ; i++) {
            if(number % 2 == 1){
                System.out.println("Please write an even number.");
            }else{
                System.out.printf("The number is: %d" , number);
            }

        }
    }
}
