package Methods;

import java.util.Scanner;

public class PracticeFunctions {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of times you want to print your name: ");
        int n =s.nextInt();

        printName(n);
    }

    public static void printName(int n)
    {
        for (int i = 0; i<n ; i++) {

            System.out.println("Hello Pradyumna");
        }
    }
}
