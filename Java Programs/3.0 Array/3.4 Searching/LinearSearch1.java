// Linear Search for Integer Array.

public class LinearSearch1
{
    public static void main(String[] args)
    {
        int a[]= {4,6,8,5,1,3,2};
        int find = 6;
        int temp= 0;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]==find)
            {
                System.out.print("Reqd no. is present at "+i+ " index position");
                temp=temp+1;
            }
        }
        if (temp==0)
        {
            System.out.println("Reqd no is not in this array");
        }

    }
}