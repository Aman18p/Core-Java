// String Sorting with Bubble Sort Algorithm

public class StringSorting
{
    public static void main(String[] args)
    {
        String[] a = {"Aman", "Arun", "Amresh", "Akansha", "Anjali", "Abhishek"};
        String Temp;
        for (int i=0;i<=a.length;i++)
        {
            for (int j = 0; j < a.length-1-i; j++)
            {
                if(a[j].compareTo(a[j+1])>0) //compareTo is a method used to compare the values lexicographically. Each character of both the string is converted into Unicide value. Lexical order is nothing but Alphabetical order.
                {
                    Temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= Temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}