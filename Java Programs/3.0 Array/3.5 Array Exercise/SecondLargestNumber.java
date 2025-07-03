// Programe to find Second Largest Number in an arrar after sorting the array.

public class SecondLargestNumber
{
    public static void main(String[] args)
    {
        int a[]={6,9,3,2,5,8,7,4,1};
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==1)
            {
                break;
            }
        }
        System.out.println("Second Largest Number is "+a[1]);
    }
}