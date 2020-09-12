import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user and initializes vars
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();
        int totalStu;
        int totalDesks;
        /*
         * totalDesks gets the values from studentsX divided by 2 so we know how many students are in that class and the we get the remainder of the same class,
         * so if there is an odd number of students, 1 gets added on. This equation makes sure that theres is enough desks even if there is one extra student.
         */
         
          totalDesks = ((students1 / 2) + (students1 % 2)) + ((students2 / 2) + (students2 % 2)) + ((students3 / 2) + (students3 % 2));
          System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}
