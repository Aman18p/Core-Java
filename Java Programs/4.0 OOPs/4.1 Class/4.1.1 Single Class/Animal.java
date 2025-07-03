public class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }

    public void run()
    {
        System.out.println("Running");
    }

    public static void main(String[] args)
    {
        Animal Dog = new Animal();
        Dog.eat();
        Dog.run();
    }
}