// Linear Search for String Array.
public class LinearSearch2
{
    public static void main(String[] args)
    {
        String a[] = {"Saksham", "Gurcharan", "Sandeep", "Amresh", "Aman"};
        String Name= "Sandeep";
        int temp= 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i]==Name)
            {
                System.out.println("Reqd Name is at " +i+ " index Number");
                temp = temp+1;
            }
        }
         if (temp==0)
         {
             System.out.println("Reqd name is not in this array.");
         }
    }
}