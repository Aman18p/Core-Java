//Hierarchial Inheritance

public class VPGroup
{
    void Emp_ID()
    {
        System.out.println("Emp_1596");
    }
}
class IT extends VPGroup
{
    void ITDepartment()
    {
        System.out.println("IT");
    }

    public static void main(String[] args)
    {
        IT Dept = new IT();
        Dept.Emp_ID();
        Dept.ITDepartment();
    }

}
class Media extends VPGroup
{
    void MediaDepartment()
    {
        System.out.println("Media");
    }
    public static void main(String[] args)
    {
        Media Dept = new Media();
        Dept.Emp_ID();
        Dept.MediaDepartment();

    }
}
class Developer extends VPGroup
{
    void DeveloperDepartment()
    {
        System.out.println("Developer");
    }

    public static void main(String[] args)
    {
        Developer Dept = new Developer();
        Dept.Emp_ID();
        Dept.DeveloperDepartment();
    }
}