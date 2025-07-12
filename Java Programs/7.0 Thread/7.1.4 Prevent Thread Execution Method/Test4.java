// join() method.
// Causes the current thread to wait until another thread finishes execution.
// Belongs to: Thread class
// Throws: InterruptedException.

public class Test4 extends Thread
{
    static Thread mainthread;
    public void run()
    {

        for (int i = 0; i < 5; i++)
        {
            try
            {
                mainthread.join();
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
        mainthread = Thread.currentThread();
        Test4 T4 = new Test4();
        T4.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}