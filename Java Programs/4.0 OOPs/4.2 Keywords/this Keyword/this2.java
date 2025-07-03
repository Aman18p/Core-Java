// this keyword can be used to invoke current class methods.(implicitly)

public class this2
{
    void display()
    {
        System.out.println("Display method");
    }
    void show()
    {
        this.display(); // if we dont use this keyword, then compiler will automatically add this keyword while compiling.
    }

    public static void main(String[] args)
    {
        this2 T2 = new this2();
        T2.show();
    }
}