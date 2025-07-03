// For Binary Search, the array must be sorted.
public class BinarySearch
{
    public static void main(String[] args)
    {
        int a[] = {2,6,8,9,10,12,14,18,20,21,23,25};
        int find = 21;
        int li = 0;
        int hi = a.length-1;
        int mi = (li+hi)/2;

        while (li<=hi)
        {
            if(a[mi]==find)
            {
                System.out.println("Reqd no. is at " +mi+ " index Position");
                break;
            }
            else if (a[mi]<find)
            {
                li=mi+1;
            }
            else
            {
                hi = mi-1;
            }
            mi=(li+hi)/2;

        }
    }
}