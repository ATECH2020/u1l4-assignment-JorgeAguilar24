import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user and initializes vars
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int deltaH;
        int deltaM;
        int deltaS;
        int secsDeltaH;
        int secsDeltaM;
        int totalSecs;

        /*
         * The code grabs both sets of time stamps and subtracts the first set from the second set.
         * The difference of the set is then converted into total seconds through multiplication based on the amount of seconds within that period of time
         * (ex: delta hours is multiplied by 3600 because there are 3600 seconds in an hour). The total is the added together and printed for the user.
         */
         
        deltaH = hours2 - hours1;
        deltaM = minutes2 - minutes1;
        deltaS = seconds2 - seconds1;
        secsDeltaH = deltaH * 3600;
        secsDeltaM = deltaM * 60;
        totalSecs = secsDeltaH + secsDeltaM + deltaS;
        System.out.print(totalSecs);

        // closing the scanner object
        scanner.close();
    }
}
