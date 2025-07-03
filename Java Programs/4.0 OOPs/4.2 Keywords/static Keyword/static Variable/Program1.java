// Static Variable is used for memory management.
// Static keyword can be used at class level and not local level.
// Static keyword is used with method.
// Static Keyword can be used as static block.
// Stactc keyword can be used in inner class and cannot be used in outer class.
// We can access static keyword directly through parent class name.

public class Program1
{
    static int a =10;
}
class Demo
{
    public static void main(String[] args)
    {
        System.out.println(Program1.a); // We can access static keyword directly through parent class name.
    }
}
