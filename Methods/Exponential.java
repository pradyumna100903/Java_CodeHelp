package Methods;

public class Exponential {

    public static void main(String[] args) {
         int res = getPow(2,4);
         System.out.println("The Answer is:  " +res);

//        int x = 2;
//        int y = 4;
//
//        double ans = Math.pow(x,y);
//        System.out.println(ans);
      
    }



    public static int getPow(int a , int b){

        int ans = 1;
        for(int count = 1; count <= b ; count++) {

            ans = ans * a;
        }
        return ans;

    }
}
