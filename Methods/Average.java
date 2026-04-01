package Methods;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("enter First Number : ");
        int firstNum = s.nextInt();
        System.out.println("Enter Second Number ");
         int secondNumber = s.nextInt();

        double result = getAverage(firstNum,secondNumber);


        System.out.println("The Average is :" +result);

    }

    public static double getAverage(int firstNumber, int secondNumber)
    {

        double average = (double) (firstNumber + secondNumber) / 2;

        return average;
    }

}
