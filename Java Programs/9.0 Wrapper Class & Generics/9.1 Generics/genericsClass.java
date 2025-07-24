//Generics Class


class Student<I, R, S>
{
    public I id;
    public R rollnumber;
    public S section;

    public Student(I id, R rollnumber, S section)
    {
        this.id = id;
        this.rollnumber = rollnumber;
        this.section = section;
    }

    public I getId()
    {
        return id;
    }
}
public class genericsClass
{
    public static void main(String[] args)
    {
        Student<Integer, Integer, String> St1 = new Student<>(1 , 101, "Shivaji");
        Student<Integer, Integer, String> St2 = new Student<>(2, 102, "Ashoka");

        System.out.println("ID: " +  St1.getId());
    }
}