// this() keyword can be used to invoke current class constructor.

public class this3
{
    this3()
    {
        System.out.println("No argument Constructor");
    }
    this3(int a)
    {
        this();
        System.out.println("Parametrised Constructor");
    }

    public static void main(String[] args)
    {
        this3 T3 = new this3(10);
    }
}