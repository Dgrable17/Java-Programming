import java.util.Scanner;
// The purpose of this code is to display how many days are within a month depending on the year.
public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

        // Has the user input the month
        System.out.println("Enter the month: ");
        int month = input.nextInt();

        // Loop to decide if the month is valid or not
        if (month < 1 || month > 12) {
            // If invalid it prints telling the user so, so they can retry
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
            return;
        }

        // Has the user input the year
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // This is determining if it is a leap year or not.
        boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // This is printing a different set of dialog depending on what the user input for the month was.
        switch (month) {
            case 1: System.out.println("January " + year + " has or will have 31 days."); break;
            //loop to determine if it is a leap year
            case 2: if (isLeapYear) {
                System.out.println("February " + year + " has or will have 29 days.");
            }
            else {
                System.out.println("February " + year + " has or will have 28 days.");
            }
            break;
            case 3: System.out.println("March " + year + " has or will have 31 days."); break;
            case 4: System.out.println("April " + year + " has or will have 30 days."); break;
            case 5: System.out.println("May " + year + " has or will have 31 days."); break;
            case 6: System.out.println("June " + year + " has or will have 30 days."); break;
            case 7: System.out.println("July " + year + " has or will have 31 days."); break;
            case 8: System.out.println("August " + year + " has or will have 31 days."); break;
            case 9: System.out.println("September " + year + " has or will have 30 days."); break;
            case 10: System.out.println("October " + year + " has or will have 31 days."); break;
            case 11: System.out.println("November " + year + " has or will have 30 days."); break;
            case 12: System.out.println("December " + year + " has or will have 31 days."); break;
        }
    }
        finally {
            input.close();
        }
    }
}
