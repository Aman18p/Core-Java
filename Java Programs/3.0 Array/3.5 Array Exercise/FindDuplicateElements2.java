// Program to find duplicate elements in an array using Set Interface method.

// Limitation - You Should Know about Collection.

import java.util.*;
public class FindDuplicateElements2
{
    public static void main(String[] args)
    {
        int Arr[] = {2,3,4,3,5,6,7,6,8,9,0,1};
        Set<Integer> S = new HashSet<>();
        for(int no: Arr)
        {
            if (S.add(no) == false)
            {
                System.out.print(no + ",");
            }
        }
    }
}