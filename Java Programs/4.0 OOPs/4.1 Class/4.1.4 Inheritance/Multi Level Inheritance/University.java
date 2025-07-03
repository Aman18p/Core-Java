//Multi Level Inheritance

public class University
{
    void UID()
    {
        System.out.println("22MCA20985");
    }
}
class Branch extends University
{
    void ComputerScience()
    {
        System.out.println("MCA");
    }

    public static void main(String[] args)
    {
        University U= new University();
        U.UID();

        System.out.println("--------------------");

        Branch B = new Branch();
        B.UID();
        B.ComputerScience();
    }
}
class Section extends Branch
{
    void Department()
    {
        System.out.println("MERN Stack");
    }

    public static void main(String[] args)
    {
        University U= new University();
        U.UID();

        System.out.println("--------------------");

        Branch B = new Branch();
        B.UID();
        B.ComputerScience();

        System.out.println("--------------------");

        Section S = new Section();
        S.UID();
        S.ComputerScience();
        S.Department();
    }
}