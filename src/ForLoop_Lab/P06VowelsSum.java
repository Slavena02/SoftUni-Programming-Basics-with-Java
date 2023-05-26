package ForLoop_Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

           int sum = 0;

        for (int index = 0; index <text.length() ; index++) {
            char symbol = text.charAt(index);

            switch (symbol){
                case 'a':
                    sum +=1;
                case 'e':
                    sum +=2;
                case 'i':
                    sum +=3;
                case 'o':
                    sum += 4;
                case 'u':
                    sum +=5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
