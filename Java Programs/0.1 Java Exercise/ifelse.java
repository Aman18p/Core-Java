//Question- Write a programe to find the no. given by user is greater then 10 or less than 10.

import java.util.*;

public class ifelse{

    public static void main(String a[])
    {
        Scanner c =new Scanner(System.in);
        System.out.println("Enter Number");
        int Number =c.nextInt();

        

        if (Number <= 10) {
            System.out.println("The number is less than or equal to 10.");
        } else {
            System.out.println("The number is greater than 10.");
        }
       
    }
}

