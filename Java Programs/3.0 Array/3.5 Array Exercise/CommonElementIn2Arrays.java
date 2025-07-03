// Find Common Element in 2 Array with for loop.
// Limitation - rrays must not contain repeating elements within themselves.

public class CommonElementIn2Arrays
{
    public static void main(String[] args)
    {
        int Arr1[] = {4,5,6,8,9};
        int Arr2[] = {8,6,3,2,1};

        for (int i = 0; i < Arr1.length; i++)
        {
            for (int j = 0; j < Arr2.length; j++)
            {
                if( Arr1[i]==Arr2[j])
                {
                    System.out.print(Arr1[i] + " ");
                }
            }
        }
    }
}