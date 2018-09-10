import java.io.*;
import java.util.*;

public class Check_Alpha {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        // Character input
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);

        // CHECKING FOR ALPHABET
        if ((ch>= 97 && ch <= 122))
            System.out.println ( "Small case letter ");

        else if (ch >= 65 && ch<= 90)
            System.out.println("Capital case letter");

            // CHECKING FOR DIGITS
        else if (ch >= 48 && ch<= 57)
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }

    // Driver Code

}




