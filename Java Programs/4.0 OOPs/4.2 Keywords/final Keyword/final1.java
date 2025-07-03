// We can use final keyword with Variables, Methods and Class.
// If we create any final variable, it become constant, we cannot change the value of final variable.
// If we create any method, we cannot override it.
// If we create final class, we cannot extend it or inherit it.

public class final1
{
    final double pi = 3.14; // the valus of pi is 3.14 and it cannot be change.
    final void start() //We have used this method becouse we only want to use this method to start the car engine. we dont want this method to be override and use for other purpose.
    {
        System.out.println("Engine Start");
    }
}
class car extends final1
{
    public static void main(String[] args)
    {
        car C = new car();
        C.start();
    }
}