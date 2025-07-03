//Initialization of object by using method.
public class Animal
{
    int age;
    String Colour;

    void Initobject(String C , int A)
    {
        Colour = C;
        age = A;
    }

    void Display()
    {
        System.out.println(Colour + + age);
    }

    public static void main(String[] args)
    {
        Animal Buzzo = new Animal();
        Buzzo.Initobject("Black " , 10);
        Buzzo.Display();
    }
}