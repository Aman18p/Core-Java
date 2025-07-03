// this keyword can be used to return the current class instance from the method.

public class this6
{
    this6 m1() // usins this6 as return type.
    {
        return this;
    }

    public static void main(String[] args)
    {
        this6 T6 = new this6();
        T6.m1();
    }
}
