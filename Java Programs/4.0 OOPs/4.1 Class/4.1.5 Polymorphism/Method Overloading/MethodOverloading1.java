// Method Overloading
//1) Same Name
//2) Within Same Class
//3) Different Arguments
//        - No. of Arguments
//        - Type of Arguments
//        - Sequence of Arguments

public class MethodOverloading1
{
    public void show(String a)
    {
        System.out.println("Method1");
    }
    public void show(int a)
    {
        System.out.println("Method2");
    }

    public static void main(String[] args)
    {
        MethodOverloading1 ans = new MethodOverloading1();
        ans.show("Aman");
    }
}