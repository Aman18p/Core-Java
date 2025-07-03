// Static block automatically call while class loading.
// We can execute Static block even without main method only if we are using jdk 1.6 version or previous versions from 1.6 version.
// We can create multiple Static blocks in a class.
// If we create multiple Static blocks. then JVM will first execute all the static block then main method.
// Static block is executed at class loading, hence at the time of class loading if we want to perforn any activity, we have to define that inside static block.
// We also write code to load native method, inside Static block.
//Static block is used to initialize the static members.

public class StaticBlock
{
    static int a;
    static
    {
        a=10;
        System.out.println(a);
        System.out.println("Static Block 1");
    }

    public static void main(String[] args)
    {
        System.out.println("I am in main method.");
    }

    static
    {
        System.out.println("Static Block 2");
    }
}