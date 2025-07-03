// Print odd and even numbers of an array.
// Limitation - You Should Know about Collection.

import java.util.ArrayList;
public class OddEvenNumber
{
    public static void main(String[] args)
    {
        int a[]= {5,6,8,9,7,2,4,3,1};

        ArrayList <Integer> al1 = new ArrayList<>();
        ArrayList <Integer> al2 = new ArrayList<>();

        for (int i = 0; i < a.length; i++)
        {
            if(a[i]%2==0)
            {
                al1.add(a[i]);
            }
            else
            {
                al2.add(a[i]);
            }
        }
        System.out.println("Even numbers are : " );
        int TotalEven=0;

        for (int no:al1)
        {
            System.out.print(no+" ");
            TotalEven=TotalEven +no;
        }
        System.out.println("\n");
        System.out.println("Total no. of even numbers are : " +al1.size() ); //Size Method
        System.out.println("Sum of Even Numbers are : " +TotalEven);
        System.out.println("\n");

        System.out.println("Odd numbers are ");
        int TotalOdd=0;
        for (int no:al2)
        {
            System.out.print(no+" ");
            TotalOdd=TotalOdd +no;
        }
        System.out.println("\n");
        System.out.println("Total no. of even numbers are : " +al2.size() ); //Size Method
        System.out.println("Sum of Odd Numbers are : " +TotalOdd);

    }
}