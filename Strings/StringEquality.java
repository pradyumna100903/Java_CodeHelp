package Strings;

public class StringEquality {
    public static void main(String[] args) {

        String name1 = "Praddy";
        String name2 = "Praddy";
        String name3 = new String("Praddy");


     // Here the output will show Strings are not equal because num1 and num3 are pointing to different memory references although their content is same  
        if(name1 == name3)
        {
            System.out.println("Strings are Equal ");
        }
        else {
            System.out.println("Strings are not equal ");
        }

     // Here the output will show Yes Both are Equal as the content will be compared here .    
        if(name1.equals(name3))
        {
            System.out.println(" Yes Both are Equal ");
        }
        else{
            System.out.println(" No Both are not equal ");
        }
        

    }
}
