//Single level Inheritance

public class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal
{
    public static void main(String[] args)
    {
        Dog D = new Dog();
        D.eat();
    }
}