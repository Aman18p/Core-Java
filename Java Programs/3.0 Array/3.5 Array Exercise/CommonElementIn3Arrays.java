// Find Common Element in 3 Different Arrays.

import java.util.*;
public class CommonElementIn3Arrays
{
    public static void main(String[] args)
    {
        int Arr1[] = {7,5,3,9,1,6};
        int Arr2[] = {8,7,2,3,6,9};
        int Arr3[] = {7,4,1,8,2,9};

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> CommonElementArray = new HashSet<>();


        for (int no:Arr1)
        {
            hs1.add(no)
        }
        for (int no:Arr2)
        {
           boolean CommonElement = hs1.add(no);
            {
                if (CommonElement==false)
                {
                    hs2.add(no);
                }
            }
        }
        for (int no:Arr3)
        {
            boolean CommonElement = hs2.add(no);
            {
                if (CommonElement ==false)
                {
                    CommonElementArray.add(no);
                    System.out.print(no +",");
                }
            }

        }
    }
}
