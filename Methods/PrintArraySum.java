package Methods;

public class PrintArraySum {

    public static void main(String[] args) {

    int[] arr = {10,20,30,40,50};

     int ans = getSum(arr);
     System.out.println("the Sum of Array Elements is " +ans);

    }

    public static int getSum(int[] arr) {

    int sum = 0;
    for (int element : arr){
        sum += element;
    }
    return sum;
    }
}
