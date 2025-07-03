// this keyword can be used to pass as an argument in the method.

public class this4
{
    void m1(this4 T4)
    {
        System.out.println(" I am in M1 method");
    }
    void m2()
    {
        m1(this);
    }

    public static void main(String[] args) {
        this4 T4 = new this4();
        T4.m2();
    }
}