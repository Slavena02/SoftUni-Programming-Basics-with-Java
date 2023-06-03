package For_Loop_MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= period ; i++) {

            int patient = Integer.parseInt(scanner.nextLine());

                if (doctors >= patient){
                    treatedPatients++;
                }else{
                    untreatedPatients++;
                }

            }

        }
    }

