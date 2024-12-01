import java.util.Scanner;
//The purpose of this code is to calculate the average of 10 double numbers.
public class Exercise7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //This creates the array known as numbers with a length of 10.
        double[] numbers = new double[10];

       //This prints out instructions to the user.
        System.out.print("This will calculate the average of 10 numbers you input.");
        System.out.print("\nPlease enter 10 numbers one at a time.\n");
        //This is a loop to have the user input the numbers into the array.
        for (int num = 0; num < 10; num++) {
            while (true) {
                System.out.print("Enter number " + (num + 1) + ": ");
                //This loop checks if the number is vaild.
                if (input.hasNextDouble()) {
                    numbers[num] = input.nextDouble();
                    break;
                }
                //This loop only happens if the number entered was invaild and states that to the user to have them retry.
                else {
                    System.out.println( "Sorry, that is not a valid number.\nPlease try again.");
                    input.next();
                }
            }
        }
        input.close();

        //This invokes the method average
        double average = average(numbers);
        //This prints what the average of the numbers entered is.
        System.out.println("The average for your numbers is " + average);
    }
    
    //This is the int average method and wont be used because we are using the average double method instead but it will return the average of int numbers.
    public static int average(int[] array) {
        //this declares sum so it can be used later.
        int sum = 0;

        //This loop sums the numbers in the array.
        for (int num : array) {
            sum += num;
        }

        //This will return the average by having the sum devided by the array length which is 10.
        return sum / array.length;
    }
   
    //This is the double average method and will return the average of double numbers.
    public static double average(double[] array){
        //this declares sum so it can be used later.
        double sum = 0;

        //This loop sums the numbers in the array.
        for (double num : array) {
            sum += num;
        }

        //This will return the average by having the sum devided by the array length which is 10.
        return sum / array.length;
    }
}