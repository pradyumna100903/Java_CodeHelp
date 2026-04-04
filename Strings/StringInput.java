package Strings;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Enter Your First Name ");
        String firstName = s.nextLine();    // Takes Entire texts/ tokens as Input

        System.out.println("Enter Your Last name ");
        String lastName = s.next();         // Takes only one token before encountering an blank space  

        System.out.println(" Your Full name is: " + firstName + " " + lastName);

      
    }
}
