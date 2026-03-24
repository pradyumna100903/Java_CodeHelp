package Arrays;
import java.util.*;

public class SumOfElements {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = s.nextInt();

        int[] arr = new int[size];
        for (int i=0 ; i<size;i++)
        {
            System.out.println("Enter the Element at index " +i);
            arr[i] =s.nextInt();
        }

        int sum = 0;
        for( int n :arr)
        {
            sum = sum +  n;
        }

        System.out.println("The Sum of Elements are : " +sum);

    }
}
