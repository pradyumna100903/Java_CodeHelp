package Methods;

public class DoubleArrayElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};

        // Array elements Before Doubling
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println("\n");

        // After Doubling the elements

        doubleArrayValues(arr);


    }



    public static void doubleArrayValues (int[] arr) {

        for (int i=0;i< arr.length;i++){

            arr[i] = 2*arr[i];
            System.out.println(arr[i]);

        }

    }

}
