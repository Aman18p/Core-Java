public class StarPattern8 
{
  public static void main(String[] args) 
  {
  
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("_");
        }

        for(int k=4;k>=i;k--)
        {
            System.out.print("*");

            for(int m=k;m<=k;m++)
            {
                System.out.print("_");
            }
        }

        for(int l=1;l<=i;l++)
        {
            System.out.print("_");
        }

        System.out.println();



    }
  }  
}
