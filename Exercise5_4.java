//This code is to convert miles to kilometers and to display it
public class Exercise5_4 {
    public static void main(String[] args) {
        //distinguishing what miles are
        int miles = 1;
        
        //prints out this shows the 1-10 conversion of miles kilometers
        System.out.println("This shows the 1-10 conversions of \nMiles Kilometers");

        //The while loop that calculates the miles to kilometers and prints said conversions
        while (miles < 11) {
            double kilometers = (miles * 1.609);
            System.out.println (miles + "     " + kilometers);
            miles++;
        }

        //prints out this is all 1-10 conversions
        System.out.println("This is all 1-10 conversions");
    }
}