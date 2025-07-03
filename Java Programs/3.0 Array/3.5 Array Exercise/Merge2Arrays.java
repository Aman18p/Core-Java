public class Merge2Arrays
{
    public static void main(String[] args)
    {
        int Arr1[] = {7,8,9,4,5};
        int Arr2[] = {6,1,2,3};

        int Arr1_length = Arr1.length;
        int Arr2_length = Arr2.length;
        int Arr = Arr1_length + Arr2_length;
        int New_Arr[] = new int[Arr];

        for (int i = 0; i < Arr1.length; i++)
        {
            New_Arr[i] = Arr1[i];
        }

        for (int i = 0; i < Arr2.length; i++)
        {
            New_Arr[Arr1.length + i] = Arr2[i];
        }

        for (int i = 0; i < New_Arr.length; i++)
        {
            System.out.print(New_Arr[i] + " ");
        }
    }
}