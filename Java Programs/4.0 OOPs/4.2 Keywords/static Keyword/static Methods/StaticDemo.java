// A ststic method can access only ststic data. It cannot access non-ststic data(instance data) .
// A static method can call only other static methods and cannot call a non static method.

public class StaticDemo
{
    static int a=10;

    static void Show()
    {
        System.out.println("Method 1");
    }

    static void Display()
    {
        Show();
        System.out.println(a);
        System.out.println("Method 2");
    }

    public static void main(String[] args)
    {
        Display();
    }
}