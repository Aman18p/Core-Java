public class StarPattern10 

 {
  public static void main(String[] args)
   {

    for(int i=1;i<=4;i++)
    {

      for(int k=1;k<=i-1;k++)
    {
      System.out.print("_");
    }


      for(int j=1;j<=1;j++)
      {
        System.out.print("*");
      }

      for(int z=3;z>=i;z--)
          {
            System.out.print("_");
          }

          for(int y=3;y>=i;y--)
          {
            System.out.print("_");
          }    

          System.out.print("_");
          System.out.print("*");
          
          for(int k=1;k<=i-1;k++)
          {
            System.out.print("_");
          }
          System.out.println();      
    }

    for(int i=1;i<=5;i++)
      {
          for(int j=4;j>=i;j--)
          {
            System.out.print("_");
          }
          System.out.print("*");
         
          for(int l=2;l<=i;l++)
          {
            System.out.print("_");
             if(l==i)
            {
                for(int m=1;m<=i-2;m++)
                {
                    System.out.print("_");
                }
                System.out.print("*");
            }
            
          }

          for(int k=4;k>=i;k--)
          {
        
            System.out.print("_");
          }

          System.out.println();
  
      }
   }
  }