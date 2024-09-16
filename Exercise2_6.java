import java.util.Scanner;
// This program is to calculate the Gratuity and total using subtotal and the rate of gratuity
public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Has the user input the subtotal then the gratuityRate
        System.out.println("Please enter Subtotal and Gratuity Rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        // Calculates what the tax is by deviding the gratuityRate by 10
        double tax = gratuityRate/10;

        // Calculates what the total is by adding the subtotal and tax together
        double total = subTotal + tax;
        
        // Prints the results of tax and total
        System.out.println("The Gratuity is $" + tax + " and the Total is $" + total);
    }
    
}
