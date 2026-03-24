package Basics;

import java.util.*;

public class GroceryDiscount {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.println("Enter the bill amount ");
        double bill = s.nextDouble();

        double finalBill;
        double discount=0;

        if(bill<1000){
            discount = bill * (5.0/100.0);
        }
        else if(bill>=1000 && bill<=5000){
          discount = bill *  0.10;
        }

        else {
            discount = bill * 0.15;
        }

        finalBill = bill - discount;

        System.out.println("Discount is : " + discount);
        System.out.println("Final Bill is : " +finalBill);

        s.close();

    }
}
