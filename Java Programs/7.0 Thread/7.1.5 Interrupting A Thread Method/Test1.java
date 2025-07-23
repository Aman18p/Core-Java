//interrupted() Method in Java
//The interrupted() method is a static method of the Thread class used to:
//Check if the current thread has been interrupted
//Clear the interrupted status immediately after checking

public class Test1 extends Thread
{
    public void run()
    {
        System.out.println(Thread.interrupted());
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
        Test1 T1 = new Test1();
        T1.start();
        T1.interrupt();
    }
}