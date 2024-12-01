import java.util.Scanner;
//The purpose of this code is to get rid of duplicates in an array and to show it got rid of the duplicates
public class Exercise7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //This creates an array named numbers with a length of 10
        int[] numbers = new int[10];

        //This prints instructions for the user
        System.out.print("This program will get rid of any duplicates that you enter.");
        System.out.print("\nPlease enter 10 numbers one at a time.\n");
        //This is a loop to have the user input the numbers into the array
        for (int num = 0; num < 10; num++) {
            while (true) {
                System.out.print("Enter number " + (num + 1) + ": ");
                //This loop checks if the number is valid
                if (input.hasNextInt()) {
                    numbers[num] = input.nextInt();
                    break;
                }
                //This loop only happens if the number entered was invalid and states that to the user to have them retry
                else {
                    System.out.print("Sorry, that is not a valid whole number.\nPlease try again.");
                    input.next();
                }
            }
        }
        input.close();

        //This prints out the original numbers the user entered
        System.out.print("\nThe original numbers you entered were:\n");
        System.out.println(java.util.Arrays.toString(numbers));

        //This envokes the method eliminateDuplicates
        int[] noDup = eliminateDuplicates(numbers);
        
        //This prints out the non duplicates out of the numbers the user entered
        System.out.print("\nThe non duplicates within the numbers are:\n");
        System.out.println(java.util.Arrays.toString(noDup));
    }

    //This is the eliminateDuplicates method it elimintes duplicates with in the users entered array
    public static int[] eliminateDuplicates(int[] list) {
        //This sorts the array making it easier to find duplicates
        java.util.Arrays.sort(list);
        
        //This sets up a new array named temp with a length of 10
        int[] temp = new int[list.length];
        //This declares index
        int index = 0;

        //This loop looks for duplicates and gets rid of them
        for (int i = 0; i < list.length; i++) {
            if (i == 0 || list[i] != list[i - 1]) {
                temp[index++] = list[i];
            }
        }

        //This creates and returns a new array that has the numbers in temp and has the length of index
        return java.util.Arrays.copyOf(temp, index);
    }
}