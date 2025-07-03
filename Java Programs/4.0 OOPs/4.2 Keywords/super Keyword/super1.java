// super keyword can be used to refer immediate parent class instance variable.

public class super1
{
    int i = 10;
}
class test extends super1
{
    int i = 20;
    void show(int i)
    {
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        test T = new test();
        T.show(30);
    }
}