// Find Common Element in 2 Array with HashSet.

import java.util.*;

public class CommonElementIn2ArraysHashSet2
{
    public static void main(String[] args)
    {
        int Arr1[] = {4,5,6,8,9,5,6};
        int Arr2[] = {7,8,9,1,2,3,7,8};

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int no: Arr1)
        {
            hs1.add(no);
        }

        for (int no: Arr2)
        {
            hs2.add(no);
        }
        for (int no: hs2)
        {
            boolean b= hs1.add(no);
            {
                if (b==false)
                {
                    System.out.print(no + ",");
                }
            }
        }
    }
}