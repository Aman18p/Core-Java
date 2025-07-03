// this keyword can be used to pass as an argument in the constructor call.

class testconstructor
{
    testconstructor(this5 T5)
    {
        System.out.println("Test class constructor");
    }
}
class this5
{
    void m1()
    {
        testconstructor T = new testconstructor(this);
    }

    public static void main(String[] args)
    {
        this5 T5 = new this5();
        T5.m1();
    }
}