//interrupt() Method in Java (Multithreading)
//The interrupt() method is used to interrupt a sleeping, waiting, or blocked thread — it signals the thread that it should stop what it’s doing and do something else.
//Common Use Case:
//To stop or cancel a thread that is sleeping or waiting.
//Used for graceful shutdowns of threads in multithreaded apps.
//If thread is sleeping/waiting--It throws an InterruptedException

public class Test extends Thread
{
    public void run()
    {

        try
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Test T = new Test();
        T.start();
        T.interrupt();
    }
}