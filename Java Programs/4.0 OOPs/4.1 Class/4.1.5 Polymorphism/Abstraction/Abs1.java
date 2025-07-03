// Through Abstract class we can achieve 0-100% Abstraction.
// A method without body (no implementation) is known as Abstract Method.
// A class has an abstract method, it should be declared abstract as well.
// Abstract class can have Abstract method as well as concrete methods.
// It is not compulsory that for Abstract Class to have Abstract method in it.
// If a regular class extends an Abstract class, then the class must have to implement all the abstract methods of parent class or it has to be declared abstract as well.
// Abstract classes cannot be instantiated, means we cannot create object of abstract class.
// Abstract methods in an abstract class are meant to be overridden in derived concrete classes otherwise compile time error will be thrown.

abstract class Abs1
{
    abstract void start();
}

class Car extends Abs1
{

    void start()
    {
        System.out.println("Starts with key");
    }
}
class Bike extends Abs1
{
    void start()
    {
        System.out.println("Starts with Kick");
    }

    public static void main(String[] args)
    {
        Car C = new Car();
        C.start();

        Bike B = new Bike();
        B.start();
    }
}