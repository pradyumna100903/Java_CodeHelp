package Methods;

import java.util.Scanner;

public class PrintName {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name you want to print: ");
        String name = s.nextLine();
        System.out.println("Enter the number of times you want to print your name: ");
        int n =s.nextInt();

        printName(name,n);
    }

    public static void printName( String name , int n)
    {
        for (int i = 0; i<n ; i++) {

            System.out.println("Hello " +name);
        }
    }
}
