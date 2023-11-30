package More;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

            for (int num1 =1 ; num1 <= 10 ; num1++){
                sum = num * num1;
                System.out.println(num + " X " + num1 + " = " + sum);            }
        }
    }
