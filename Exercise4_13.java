import java.util.Scanner;
//The purpose of this code is to check if a letter is a consonant or a vowel
public class Exercise4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prints enter a letter and has the user input said letter
        System.out.println("Enter a letter");
        String letter = input.nextLine();

        //Checks to see if there is only 1 letter
        if (letter.length() != 1) {
            System.out.println(letter + " is an invald input.");
            input.close();
            return;
        }

        //Makes the letter a charater
        char ch = letter.charAt(0);

        //This checks whether the letter is a consonant or a vowel or an ivalid input and prints a message depending on which one it is
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            case 'y':
            case 'Y':
                System.out.println(ch + " is a vowel.");
                break;
            case 'b':
            case 'B':
            case 'c':
            case 'C':
            case 'd':
            case 'D':
            case 'f':
            case 'F':
            case 'g':
            case 'G':
            case 'h':
            case 'H':
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
            case 'm':
            case 'M':
            case 'n':
            case 'N':
            case 'p':
            case 'P':
            case 'q':
            case 'Q':
            case 'r':
            case 'R':
            case 's':
            case 'S':
            case 't':
            case 'T':
            case 'v':
            case 'V':
            case 'w':
            case 'W':
            case 'x':
            case 'X':
            case 'z':
            case 'Z':
                System.out.println(ch + " is a consonant.");
                break;
            default:
                System.out.println(ch + " is an invald input.");
        }
    input.close();
    }
}
