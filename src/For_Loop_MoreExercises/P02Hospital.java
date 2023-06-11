package For_Loop_MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int day = 1; day <= period; day++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (day % 3 == 0){
                doctors++;
            }
            if (doctors >= patients) {
                treatedPatients += patients ;
            }else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }

        }
            System.out.println("Treated patients: " + treatedPatients + ".");
            System.out.println("Untreated patients: " + untreatedPatients + ".");



    }
}

