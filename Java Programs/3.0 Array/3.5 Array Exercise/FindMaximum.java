// Find the Maximum Value in an Array

public class FindMaximum
{
    public static void main(String[] args)
    {
        int a[] = {5,6,9,3,2,12,4};
        int max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (max < a[i])
            {
                max= a[i];
            }
        }
        System.out.println("maximum value is " + max);

    }
}