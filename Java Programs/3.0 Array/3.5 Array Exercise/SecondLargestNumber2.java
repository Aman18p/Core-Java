// Programe to find Second Largest Number in an arrar without sorting the array.

public class SecondLargestNumber2
{
    public static void main(String[] args)
    {
        int a[]={6,9,3,2,5,8,7,4,1};
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++)
        {
            if(a[i]>Largest)
            {
                SecondLargest = Largest;
                Largest = a[i];
            } else if (a[i]>SecondLargest && a[i]!=Largest)
            {
                SecondLargest = a[i];
            }
        }
        if(SecondLargest==Integer.MIN_VALUE)
        {
            System.out.println("...");
        }
        else
        {
            System.out.println("Second Largest Number is "+SecondLargest);
        }
    }
}