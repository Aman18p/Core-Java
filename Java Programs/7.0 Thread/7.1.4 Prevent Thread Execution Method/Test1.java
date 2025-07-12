//sleep() method for Threads
//Temporarily pauses the current thread for a specific time (in milliseconds).
//Throws: InterruptedException
//Belongs to: Thread class
//Does NOT release lock

public class Test1 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        Test1 T1 = new Test1();
        T1.start();
    }
}