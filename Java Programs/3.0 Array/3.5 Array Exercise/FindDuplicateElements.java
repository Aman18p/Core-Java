// Program to find duplicate elements in an array using brute force method.
// Limitation: This method only works correctly if any duplicate number appears exactly once.

public class FindDuplicateElements
{
    public static void main(String[] args)
    {
        System.out.println("Duplicate elements are");
        int a[] = {9,5,1,6,2,3,5,4,7,4,6,};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    System.out.println(a[j]);
                }
            }
        }

    }
}