import java.util.Scanner;
public class FactorialByRecursion 
{
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        int no=s.nextInt();
        int fact;
        FactorialByRecursion F=new FactorialByRecursion();
        fact=F.calcFact(no);
        System.out.println("factorial of " +no+ "is "+fact);
    }
    int calcFact(int no)
    {
        if(no>=1)
        {
            return(no*calcFact(no-1));
        }
        return 1; 
    } 
}
