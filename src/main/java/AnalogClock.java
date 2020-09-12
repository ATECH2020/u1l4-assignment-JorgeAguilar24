import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourHand = scanner.nextInt();
        int minuteHand;
        /*
         *  your code goes here
         */
            minuteHand = (hourHand % 30) * 12;
            System.out.print(minuteHand);
        // closing the scanner object
        scanner.close();
    }
}
