public class CounterDemo
{
    static int Count = 0;
    CounterDemo()
    {
        Count++;
        System.out.println(Count);
    }

    public static void main(String[] args)
    {
        CounterDemo C1 = new CounterDemo();
        CounterDemo C2 = new CounterDemo();
        CounterDemo C3 = new CounterDemo();

    }
}