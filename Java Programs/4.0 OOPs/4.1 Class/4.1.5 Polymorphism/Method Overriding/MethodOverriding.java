// Method Overriding
//1) Same Name
//2) Within Different Class
//3) Same Arguments
//        - No. of Arguments
//        - Type of Arguments
//        - Sequence of Arguments
//4) Inheritance(IS-A relationship)

public class MethodOverriding
{
    void show(int a, String b)
    {
        System.out.println("Method 1");
    }
}
class test extends MethodOverriding
{
    void show(int a, String b)
    {
        System.out.println("Method 2");
    }

    public static void main(String[] args)
    {
        test XYZ = new test();
        XYZ.show(20,"Aman");

        MethodOverriding ABC = new MethodOverriding();
        ABC.show(40,"Abhishek");
    }
}