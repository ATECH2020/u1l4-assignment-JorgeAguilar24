import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user and initialize variable
        int secs = scanner.nextInt();
        int hours;
        int mins;

        /*hours and mins convert the seconds inputted into full hours and full minutes.
        * the full minutes and full hours are thten printed out for the user to see.
        */
        hours = secs / 3600;
        mins = secs / 60;
        System.out.print(hours + " " + mins);


        // closing the scanner object
        scanner.close();
    }
}
