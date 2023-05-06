package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();


        if ("m".equals(type)){
            if(years>=16){
                System.out.println("Mr.");
            }else{
                System.out.println("Master");
            }
        }else if ("f".equals(type)){
            if (years >=16){
                System.out.println("Ms.");
            }else{
                System.out.println("Miss");
            }
        }

    }
}
