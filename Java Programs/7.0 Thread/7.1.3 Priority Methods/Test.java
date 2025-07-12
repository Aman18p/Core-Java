//Thread Priority in Java
//In Java, every thread has a priority, which helps the Thread Scheduler decide which thread to run first (but not guaranteed).
//Priority Range:-
//Thread.MIN_PRIORITY   = 1
//Thread.NORM_PRIORITY  = 5 (default)
//Thread.MAX_PRIORITY   = 10

//Priority values: 1 to 10 --Anything else will throw IllegalArgumentException

public class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread Run");
    }

    public static void main(String[] args)
    {
        Test T1 = new Test();
        T1.start();
        T1.setPriority(8);
        System.out.println(T1.getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        //Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("main Thread");


    }
}