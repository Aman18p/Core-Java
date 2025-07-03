// We can call Static Method directly by its name within a class.
// We can call Static Methods directly with with Class name within a class.
// Static method belongs to the class, not to the object.
// A ststic method can be accessed directly by class name and doesn't need any object.
// A ststic method can access only ststic data. It cannot access non-ststic data(instance data) .
// A static method can call only other static methods and cannot call a non static method.
// a static method cannot refer to "this" or "super" keyword in anyway.

public class TestMethod
{
    static void Display()
    {
        System.out.println(" Static Method 1");
    }

    public static void main(String[] args)
    {
        Display();
        TestMethod.Display();
        TestMethod2.Display2();
    }
}
class TestMethod2
{
    static void Display2()
    {
        System.out.println(" Static Method 2");
    }
}