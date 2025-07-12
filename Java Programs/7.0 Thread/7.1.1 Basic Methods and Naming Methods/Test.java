//Basic Methods and Naming Methods.

public class Test extends Thread
{
    public void run()
    {
        System.out.println("Thrad-0 Task");
        Thread.currentThread().setName("First Thread");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        Test T1 = new Test();
        T1.start();
        //T1.setName("Aman");
        //System.out.println(T1.getName());
        System.out.println("Main Thread Task");
        System.out.println(Thread.currentThread().getName());
        System.out.println(T1.isAlive());
    }
}