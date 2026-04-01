package Methods;

import java.util.Scanner;

public class PrintNNumbersSum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number till whose sum you want: ");
        int n=s.nextInt();

        int result = getSum(n);
        System.out.println("the Sum is : " +result);
    }

    public static int getSum(int n){

    int sum=0;

        for (int i = 0; i <=n ; i++) {
            sum += i;

        }

        return sum;
    }


}
