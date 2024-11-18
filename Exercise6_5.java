import java.util.Scanner;
//The purpose of this code is to display three numbers that the user inputs in increasing order
public class Exercise6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prints please enter a number and has the user input a response
        System.out.println("Please enter a number.");
        double firstResponse = input.nextDouble();
        System.out.println("Please enter a second number.");
        double secondResponse = input.nextDouble();
        System.out.println("Please enter the third and final number.");
        double thirdResponse = input.nextDouble();
        input.close();

        //prints your numbers in increasing order are:
        System.out.println("Your numbers in increasing order are:");

        //starts the module using user inputs
        displaySortedNumbers(firstResponse, secondResponse, thirdResponse);
    }

    //is the module to test and confirm the order of the numbers
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        //declaring these then testing them against eachother
        double lowestNum = num1;
        double midNum = num2;
        double highestNum = num3;

        //this loop tests num1 and num2 to see if they need to switch
        if(num1 > num2) {
            lowestNum = num2;
            midNum = num1;
        }

        //this loop tests if the midNum and the num3 need to switch
        if(midNum > num3) {
            highestNum = midNum;
            midNum = num3;
        }

        //this loop tests if the lowestNum and the midNum need to switch
        if(lowestNum > midNum) {
            double temp = lowestNum;
            lowestNum = midNum;
            midNum = temp;
        }

        //prints out the results
        System.out.println(lowestNum + " " + midNum + " " + highestNum);
    }
}