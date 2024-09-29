import java.util.Scanner;
//The purpose of this code is to calculate the area of a hexagon using the side
public class Exercise4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Has the user input what the side of the hexagon is
        System.out.println("Enter the side of the hexagon");
        double side = input.nextDouble();

        //Caluclates the area using the input
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        //Prints what the area is
        System.out.println("The area of the hexagon is " + Math.round(area * 100) / 100.0);

        input.close();
    }
    
}
