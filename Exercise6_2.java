import java.util.Scanner;
//The purpose of this code is to compute the sum of the digits within an integer
public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prints instructions and gains user input
        System.out.println("This will give the sum of the digits within the\ninteger inputted please enter an integer.");
        long userInput = input.nextLong();
        input.close();

        //prints the users input then the sum which leads to the method
        System.out.println("The sum of your " + userInput + " is " + sumDigits(userInput));
    }

    //the method that will calculate the sum using the digits with the integer
    public static int sumDigits(long n) {
        int sumDigits = 0;

        //a loop that extracts the last digit then removes digit until 0
        while(n > 0) {
            sumDigits += n % 10;
            n = n / 10;
        }
        
        //brings the sum up to the print command
        return sumDigits;
    }
}