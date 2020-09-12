import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user and initialize vars
        int hourHand = scanner.nextInt();
        int minuteHand;
        /*
         *  the minuteHand equation gets the angle of the hourhand inputted by the user and gets the remainder of it once divided by 30. 
         We divide it by 30 because that is the amount of degrees from midnight to 1, 
         and the remainder of it will give us how many the degrees hourHand has moved from the current hour.
         We multiply by 12 to see how far the minuteHand has moved on the clock.
         */
            minuteHand = (hourHand % 30) * 12;
            System.out.print(minuteHand);
        // closing the scanner object
        scanner.close();
    }
}
