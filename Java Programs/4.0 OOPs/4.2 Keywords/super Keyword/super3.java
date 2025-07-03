// super keyword can be used to invoke immediate parent class constructor.

public class super3
{
    public super3()
    {
        System.out.println("I am in class Super3");
    }
}
class test extends super3
{
    public test()
    {
        super(); //if we dont use super keyword, then compiler will automatically add this keyword while compiling.
        System.out.println("I am in class test");
    }

    public static void main(String[] args)
    {
        test t = new test();
    }
}