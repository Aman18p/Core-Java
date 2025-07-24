// Bounded generics allow you to place constraints (bounds) on the type parameters. This helps in restricting what types can be used as arguments for a generic type.

public class Printer<T extends Number>
{
    T value;

    public Printer(T value)
    {
        this.value = value;
    }

    public void printDouble()
    {
        System.out.println(value.doubleValue());
    }

    public static void main(String[] args)
    {
        Printer<Integer> p1 = new Printer<>(10);
        p1.printDouble();

        Printer<Double> p2 = new Printer<>(22.5);
        p2.printDouble();

        // Printer<String> p3 = new Printer<>("Hello"); // Error
    }
}

//Number is a superclass of all numeric wrapper classes in Java.
//It has built-in methods like:-
//-intValue()
//-doubleValue()
//-floatValue() etc.
