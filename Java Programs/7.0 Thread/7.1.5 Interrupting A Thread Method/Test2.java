//isInterrupted() Method in Java
//The isInterrupted() method is used to check whether a specific thread has been interrupted — without clearing the interrupt status.
//Belongs to: Thread class (non-static)
//Returns: boolean
//Does NOT clear the interrupt flag

public class Test2 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().isInterrupted());
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
        Test2 T2 = new Test2();
        T2.start();
        T2.interrupt();
    }
}