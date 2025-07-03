import java.io.*;
class ReadAndWrite
{
    void Read() throws FileNotFoundException
    {
        FileInputStream Fis = new FileInputStream("d:/abc.txt");
    }

    void Write() throws FileNotFoundException
    {
        FileOutputStream Fos = new FileOutputStream("d:/xyz.txt");
    }
}

public class ThrowsExample
{
    public static void main(String[] args)
    {
        ReadAndWrite rw = new ReadAndWrite();
        try
        {
            rw.Read();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        try
        {
            rw.Write();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}