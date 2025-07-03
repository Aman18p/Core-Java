public class DeleteElementInArray
{
    public static void main(String[] args)
    {
        int Arr[] = {1,2,3,8,4,5};
        int DeleteElement = 8;

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == DeleteElement)
            {
                for (int j = i; j < Arr.length-1; j++)
                {
                    Arr[j] = Arr[j + 1];
                } break;
            }
        }
        for (int i = 0; i < Arr.length-1; i++)
        {
            System.out.print( Arr[i] + " ");
        }
    }
}