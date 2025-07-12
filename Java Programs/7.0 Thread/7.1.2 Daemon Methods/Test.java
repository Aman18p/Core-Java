// Daemon Methods.
//A daemon thread is a special type of thread in Java that runs in the background to perform tasks like garbage collection, monitoring, etc.
//It provides service to the threads.
// We cannot create main thread as daemon thread.

class Test extends Thread
{
    public void run()
    {
        System.out.println("First Thread");
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args)
    {
        System.out.println("main Thread");
        Test T1 = new Test();
        T1.setDaemon(true); //We have to create the deamon thread before starting the thread execution. otherwise throws illigleThreadStateException.
        T1.start();
    }
}