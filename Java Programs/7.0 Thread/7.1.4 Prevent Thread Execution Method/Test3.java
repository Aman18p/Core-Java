// join() method.
// Causes the current thread to wait until another thread finishes execution.
// Belongs to: Thread class
// Throws: InterruptedException.

public class Test3 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                System.out.println("Child Thread" +":" + i);
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        Test3 T3 = new Test3();
        T3.start();
        T3.join();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}