import java.util.Scanner;
//This is to calculate the tuition of ten years plus the total of four more after the tenth year 
public class Exercise5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring year and total
        int year = 1;
        double total = 0;
        
        //prints instructions for the user to input
        System.out.println("This will calculate the 10 year and the total of the 4 proceeding years.\n");
        System.out.println("Please enter the initial tuition you have: ");
        double initialTuition = input.nextDouble();
        System.out.println("\nPlease enter the annual increase percentage with a whole number: ");
        double annualIncreasePercentage = input.nextDouble();
        input.close();

        //calculates the percentage into an actual percentage
        double annualIncrease = 1 + (annualIncreasePercentage / 100);

        //loop to calculate the first 10 years of tuition
        for (year = 1; year <= 10; year++) {
            initialTuition *= annualIncrease;
        }

        // Prints Year 10 Tuition is $tuition
        System.out.printf("\nYear 10 Tuition is $%.2f\n", initialTuition);

        // Loop to calculate tuition after 10 years with annual increases
        for (year = 11; year <=14; year++) {
            initialTuition *= annualIncrease;
            total += initialTuition;
        }

        //prints The total tuition for 11-14 is $total
        System.out.printf("The total tuition for 11-14 is $%.2f\n", total);
        //prints That was the tuition for the 10th year and the total for the 4 years after
        System.out.println("That was the tuition for the 10th year and the\ntotal for the 4 years after.");
    }
}
