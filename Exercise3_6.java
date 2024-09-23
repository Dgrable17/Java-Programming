import java.util.Scanner;
// The purpose of this program is to calculate BMI and state whether it is underweight, normal, overweight, or obese.
public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather the weight, feet, and remaining inches from the user.
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter Height in feet: ");
        double heightFeet = input.nextDouble();
        System.out.println("Enter Height in remaining intches: ");
        double heightInches = input.nextDouble();

        //Calculate BMI
        double totalInches = (heightFeet * 12) + heightInches;
        double bmi = (weight / (totalInches * totalInches)) * 703;
        System.out.println("BMI is " + bmi);

        //If statements that hold the range and print depending on what range the user is in.
        if (bmi < 18.5)
            System.out.println("You are underweight.");
        else if (bmi >= 18.5 && bmi < 25.0)
            System.out.println("You are Normal weight.");
        else if (bmi >= 25.0 && bmi < 30.0)
            System.out.println("You are Overweight.");
        else if (30.0 <= bmi)
            System.out.println("You are Obese.");
    }
}
