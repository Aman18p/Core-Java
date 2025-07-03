// Find Common Element in 2 Array with HashSet.
// Limitation - rrays must not contain repeating elements within themselves.

import java.util.*;

public class CommonElementIn2ArraysHashSet
{
    public static void main(String[] args)
    {
        int Arr1[] = {4,5,6,8,9,5};
        int Arr2[] = {7,8,9,1,2,3};

        HashSet<Integer> hs = new HashSet<>();
        for (int no: Arr1)
        {
            hs.add(no);
        }

        for (int no: Arr2)
        {
           boolean b= hs.add(no);
            {
                if (b==false)
                {
                    System.out.print(no + ",");
                }
            }
        }
    }
}