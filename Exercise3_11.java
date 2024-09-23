import java.util.Scanner;
// The purpose of this code is to display how many days are within a month depending on the year.
public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Has the user input the month and than the year.
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // This is determining if it is a leap year or not.
        boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // This is saying if the leap year is true and it is the second month print "febuary of user chosen year had 29 days."
        if (isLeapYear == true && month == 2) {
            System.out.println("February " + year + " Had 29 days.");
            return;
        }

        // This is printing a different set of dialog depending on what the user input for the month was.
        switch (month) {
            case 1: System.out.println("January " + year + " Had 31 days."); break;
            case 2: System.out.println("February " + year + " Had 28 days."); break;
            case 3: System.out.println("March " + year + " Had 31 days."); break;
            case 4: System.out.println("April " + year + " Had 30 days."); break;
            case 5: System.out.println("May " + year + " Had 31 days."); break;
            case 6: System.out.println("June " + year + " Had 30 days."); break;
            case 7: System.out.println("July " + year + " Had 31 days."); break;
            case 8: System.out.println("August " + year + " Had 31 days."); break;
            case 9: System.out.println("September " + year + " Had 30 days."); break;
            case 10: System.out.println("October " + year + " Had 31 days."); break;
            case 11: System.out.println("November " + year + " Had 30 days."); break;
            case 12: System.out.println("December " + year + " Had 31 days."); break;
        }
    }
}
