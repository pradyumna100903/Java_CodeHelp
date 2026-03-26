package Arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int size;
        System.out.println("Enter The Size of the Array ");

        size = s.nextInt();

        int[] arr= new int[size];

        for (int i = 0; i < size ; i++) {

            System.out.println("Enter the Element at Index " +i);
            arr[i] =s.nextInt();

        }

        long product =1;

        for( int nums : arr)
        {
            product = nums * product ;
        }

        System.out.println("The Product of Array Elements is : "+product);


    }
}
