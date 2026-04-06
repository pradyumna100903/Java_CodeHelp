package Strings;

public class StringMethods {
    public static void main(String[] args) {

        String str ="Praddy";

        System.out.println(str.length());   // Returns the total number of characters in the String present.

        System.out.println(str.charAt(0)); // Returns the character at specific index position mentioned

        System.out.println(str.substring(0,3));  // prints the Substring by  including first index and excluding last index mentioned in brackets

        System.out.println(str.substring(1));  // prints entire substring from that particular index mentioned

        System.out.println(str.toUpperCase());  // Converts to UpperCase

        System.out.println(str.toLowerCase());  // Converts to LowerCase

        System.out.println(str.contains("addy"));  // returns true if that string is present else false

        String s1 = "     paasd    ";
        System.out.println(s1);
        System.out.println(s1.trim()); // removes the leading and trailing blank spaces


        String s2 = "My,name,is,Praddy";

        String[] words = s2.split(" "); // Splits the string around matches of given regular expression

        for(String word:words){

            System.out.println(word);

        }


        // Some More Additional String Methods

        /*

        str.startsWith();  -> To Check if the String starts with some string
        str.endsWith();  ->  TO Check if the String ends with some String
        str.valueOf();   ->     Converts Different Datatype into String
        str.replace('a' , 'x'); ->   Replaces one character with other
        str.toCharArray();  ->  Converts to Char Array
        str.isBlank();  ->  Checks if String is blank (empty or contain white spaces)
        str.isEmpty();  ->  Checks if string is empty(Length is 0 )

         */










    }
}
