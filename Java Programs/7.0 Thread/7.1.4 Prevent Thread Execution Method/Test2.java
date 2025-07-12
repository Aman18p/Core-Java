// yield() method.
// Tells the thread scheduler to pause current thread and give chance to other threads of same priority.
//Belongs to: Thread class
//No exception thrown
//It’s just a hint to CPU (may or may not pause)

public class Test2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() +":"+i );
        }
    }

    public static void main(String[] args)
    {
        Test2 T2 = new Test2();
        T2.start();

        for (int i = 0; i < 5; i++)
        {
            Thread.yield();
            System.out.println(i);
        }
    }
}