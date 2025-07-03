public class InsertElementInArray
{
    public static void main(String[] args)
    {
        int Arr[] ={1,2,4,5,6};
        int pos = 3;
        int Element = 100;

        for (int i = Arr.length - 1; i < pos - 1; i--)
        {
            Arr[i] = Arr[i-1];
        }
        Arr[pos-1] = Element;

        for (int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}