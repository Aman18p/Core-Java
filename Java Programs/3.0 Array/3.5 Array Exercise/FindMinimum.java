// Find the Minimum Value in an Array

public class FindMinimum
{
    public static void main(String[] args)
    {
        int a[] = {5,6,9,3,2,12,4};
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("minimum value is " + min);
    }
}