// Interface are similar to Abstract class but can have only Abstract method in it. (After 8th version we can create default contrete method too e.g., default void display(){})
// Interface are the Blueprint of the class. it specify what a class must have do but not how.
// It is use to achieve abstraction.
// It support multiple Inheritance.
// it can be used to achieve loose coupling.
// All the methods in Interface are Public Abstract type.
// All the fields in Interface are by default comes with public static final keyword. e.g., public static final int a = 10;
// After 8th Version we can create Static contrete methods in it.(only with Public access modifier)
// After 9th version we can create Private methods in it.
// We use implements keyword to inherite interface in a class.
//If a regular class extends an Interface, then the class must have to implement all the abstract methods of parent class or it has to be declared abstract as well.
// we cannot create object of Interface.

interface IF1
{
    public static final int a=10;
    void start();
}
interface IF2
{
    void run();
}
class Car implements IF1, IF2
{
    public void start()
    {
        System.out.println("Engine Start");
    }

    public void run()
    {
        System.out.println("Car is running at a speed of 200kmph");
    }

    public static void main(String[] args)
    {
        Car C = new Car();
        C.start();
        C.run();
    }
}