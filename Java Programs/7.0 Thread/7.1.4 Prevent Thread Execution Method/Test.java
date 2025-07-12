//sleep() method for main Thread
//Temporarily pauses the current thread for a specific time (in milliseconds).
//Throws: InterruptedException
//Belongs to: Thread class
//Does NOT release lock

public class Test
{
    public static void main(String[] args)
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
}

//sleep() Method Key Points
//If the value of milliseconds is negative, then an IllegalArgumentException is thrown.
//If the value of nanoseconds is not in the range 0–999999, then an IllegalArgumentException is thrown.
//Whenever we want to use the sleep() method, we also need to handle the InterruptedException.
//If we do not handle it, the JVM will show a compilation error.
//When any thread is sleeping and another thread interrupts it, then it throws an InterruptedException.
//The sleep() method always pauses the current thread execution.
//When the JVM finds the sleep() method in code, it checks which thread is running and pauses its execution.
//When we use the sleep() method to pause execution, the thread scheduler assigns the CPU to another thread (if one exists).
//So, there is no guarantee that the thread will wake up exactly after the specified time —
//it totally depends on the thread scheduler.
//While a thread is sleeping, it does not lose any locks or monitors it had acquired before going to sleep.