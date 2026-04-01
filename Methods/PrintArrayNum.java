package Methods;

public class PrintArrayNum {

    public static void main(String[] args) {

        int[] arr = {10,20,40,50,60};
            printArray(arr);

    }


    public static void printArray(int[] arr) {
        for(int element:arr){
            System.out.println(element);
        }

    }



}
