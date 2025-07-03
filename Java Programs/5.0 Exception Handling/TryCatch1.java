import java.io.*;

public class TryCatch1
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream FIS = new FileInputStream("d:/abc.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}