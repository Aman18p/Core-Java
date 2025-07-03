public class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }

    public static void main(String[] args)
    {
        Animal Buzzo = new Animal();
        Bird Crow = new Bird();
        Buzzo.eat();
        Buzzo.run();
        Crow.fly();


    }
    public void run()
    {
        System.out.println("Running");
    }
}
class Bird
{
    public void fly()
    {
        System.out.println("Flying");
    }
}