import java.util.Scanner;
// This program is to convert Celsius to Fahrenheit
public class Exercise2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Has the user input Celsius
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // Runs calculations then prints results
        double fahrenheit = (9.0/5)*celsius + 32 ;
        System.out.println( celsius + " Celsius " + "is " + fahrenheit + " in Fahrenheit");
    }
}
