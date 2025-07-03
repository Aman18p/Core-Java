//The finally block is used to execute important code such as closing resources, no matter what happens in the try or catch block.
//Always executes whether exception occurs or not.
//Executes even if there is a return, break, or continue inside try or catch.

//Commonly used for cleanup tasks like:
//Closing files
//Closing database connections
//Releasing memory or resources

// We can use multiple catch block with one try block but we can only use one finally block with one try block.

//There are rare cases where it doesn't. Here are the 4 main cases when the finally block does not execute:
//If you call System.exit(0) inside try or catch, it terminates the JVM before finally executes.
//If the JVM crashes before reaching the finally block, it obviously won't execute. (e.g., OutOfMemoryError, StackOverflowError)
//If the user or OS forcibly stops the program while it's running in try/catch, finally won't execute.
//If the thread executing the try block is forcefully stopped (e.g., using Thread.stop() — now deprecated), the finally block might be skipped.
import java.io.*;
public class FinallyBlock
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream FIS = new FileInputStream("d:/abc.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("This block will always execute.");
        }
    }
}