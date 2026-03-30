package Arrays;

import java.util.*;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // Creation of 2D Arrays 
        // int[][] arr = new int[3][3];

     // Initialization of 2D Arrays
      int[][] arr = {
            {2,4,6},
            {1,3,5},
            {10,20,30}
      };


    // printing 2D arrays Using for each loop

//        for(int[] temp: arr){
//            for(int num: temp){
//                System.out.println(num);
//            }
//        }


        // Printing Using Normal For Loop

        int rowSize = arr.length;
        int colSize = arr[0].length;

          for (int i = 0; i <rowSize ; i++) {
            for(int j=0 ; j<colSize;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }

    }
}
