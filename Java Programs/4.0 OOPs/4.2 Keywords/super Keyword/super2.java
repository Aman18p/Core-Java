// super keyword can be used to invoke immediate parent class method.

public class super2
{
    void m1()
    {
        System.out.println("I am in class super2");
    }
}
class test extends super2
{
    void m1()
    {
        System.out.println("I am in class test");
    }
    void show()
    {
        m1();
        super.m1();
        System.out.println("This in test class");
    }

    public static void main(String[] args)
    {
        test T = new test();
        T.show();
    }
}