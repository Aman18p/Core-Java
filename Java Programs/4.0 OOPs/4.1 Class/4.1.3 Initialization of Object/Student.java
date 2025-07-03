//Initialization of object by reference varialbe.

public class Student
{
    int Roll_Number;
    String Section;

    public static void main(String[] args)
    {
        Student Aman = new Student();
        Aman.Roll_Number = 1;
        Aman.Section = "A";
        System.out.println("Roll Number : " + Aman.Roll_Number  + " Section : " +Aman.Section);
    }
}