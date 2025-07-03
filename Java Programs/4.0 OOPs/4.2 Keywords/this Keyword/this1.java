// this keyword can be used ti refer current class instance variable.

public class this1
{
    int i;
    void setValue(int i)
    {
        this.i = i;
    }
    void show()
    {
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        this1 T1 = new this1();
        T1.setValue(100);
        T1.show();
    }
}