import java.util.*;

class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}

public class ThrowExample
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age : ");

        int age = s.nextInt();
        try
        {
            if(age<18)
            {
                throw new YoungerAgeException("You are not eligible");
            }
            else
            {
                System.out.println("You are Eligible");
            }
        }
        catch (YoungerAgeException e)
        {
            System.out.println(e);
        }
    }
}