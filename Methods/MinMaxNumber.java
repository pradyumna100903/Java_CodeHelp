package Methods;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = s.nextInt();
        System.out.println("Enter Second Number ");
        int b =s.nextInt();

//       int res = getMin(a,b);
//        System.out.println("The Minimum Number is :" +res);

        int res =getMax(a,b);
        System.out.println("The Maximum Number is: " +res);


    }

    public static int getMin(int a, int b){

        if(a<b){
            return a;
        }
        else
        {
            return b;
        }

    }

    public static int getMax(int a , int b)
    {
        if(a>b)
            return a;
        else
            return b;


    }


}
