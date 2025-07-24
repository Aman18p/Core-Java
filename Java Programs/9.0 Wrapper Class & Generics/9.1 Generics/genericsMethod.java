//Generics Method

public class genericsMethod
{
    public static <E> void printData(E data)
    {
        System.out.println(data);
    }

    public static void main(String[] args)
    {
        printData("Aman");
        printData(143);
        printData("Akansha");
        printData(true);
    }
}