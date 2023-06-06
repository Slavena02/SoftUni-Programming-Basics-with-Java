package WhileLoop_Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              String input = scanner.nextLine();

              double money = 0;
              while (!input.equals("NoMoreMoney")){
                  double output = Double.parseDouble(scanner.nextLine());

                  money += output;

                  if (output == 0){

                  }

              }
            }
        }
