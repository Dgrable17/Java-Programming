//This is to calculate the tuition of ten years plus the total of four more after the tenth year with a starting tuition of 10,000 that increases by 5% each year 
public class Exercise5_7 {
    public static void main(String[] args) {
        //declaring year and starting tuition and total
        int year = 1;
        double total = 0;
        double tuition = 10000;

        //prints For a university that starts at $10,000 and increases by 5% each year
        System.out.println("For a university that starts at $10,000 and\n increases by 5% each year.");
        //prints This will calculate the 10 year and the total of the 4 proceeding years
        System.out.println("This will calculate the 10 year and the total of the 4 proceeding years.\n");

        //loop to calculate the first 10 years of tuition
        for (year = 1; year <= 10; year++) {
            tuition *= 1.05;
        }

        //prints Year 10 Tuition is $tuition
        System.out.printf("Year 10 Tuition is $%.2f\n", tuition);

        //loop to calculate the total using the 4 years after the first 10
        for (year = 11; year <=14; year++) {
            tuition *= 1.05;
            total += tuition;
        }

        //prints The total tuition for 11-14 is $total
        System.out.printf("The total tuition for 11-14 is $%.2f\n", total);
        //prints That was the tuition for the 10th year and the total for the 4 years after
        System.out.println("\nThat was the tuition for the 10th year and the\n total for the 4 years after.");
    }
}