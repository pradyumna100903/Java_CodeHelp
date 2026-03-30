package Arrays;

public class SumOf2DArrays {
    public static void main(String[] args) {

        int [][] arr = {
                {2,4,6},
                {1,3,5},
                {10,20,30}
        };

    // Using Enhanced For Loop or For Each Loop 
        int forEachSum = 0;
        for(int[] temp : arr){
        for(int newTemp : temp) {
            forEachSum += newTemp;
        }
    }    

        
    System.out.println("The Sum of 2d Array Elements using for each loop is : " +forEachSum);


        // Using Normal For Loop 
        int rowSize = arr.length;
        int colSize = arr[0].length;

        int sum =0;
        for (int i = 0; i <rowSize ; i++) {
            for (int j = 0; j <colSize ; j++) {
                sum  = sum + arr[i][j];
            }
        }

        System.out.println("Final Sum of 2d Arrays is: "+sum);




    }

}
