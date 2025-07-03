// Find Common Element in 2 Array with ForLoop and HashSet.

import java.util.*;

public class CommonElementIn2ArraysForloopHashSet
{
    public static void main(String[] args)
    {
        int Arr1[] = {4,5,6,8,9,5,4};
        int Arr2[] = {7,8,9,1,2,3,8};

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < Arr1.length; i++)
        {
            for (int j = 0; j < Arr2.length; j++)
            {
                if (Arr1[i]==Arr2[j])
                {
                    hs.add (Arr1[i]);
                    break;
                }
            }
        }
        for (int no:hs)
        {
            System.out.print(no + ",");
        }
    }
}