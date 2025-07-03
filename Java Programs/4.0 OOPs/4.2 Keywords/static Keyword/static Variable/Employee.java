public class Employee
{
    int Emp_Id;
    String Name;
    static String Company = "VP Group";

            Employee(int Emp_ID, String Name)
            {
                this.Emp_Id = Emp_ID;
                this.Name = Name;
            }
            void Display()
            {
                System.out.println(Emp_Id + " " +Name +" " + Company);
            }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Aman");
        e1.Display();
        Employee e2 = new Employee(102, "Akansha");
        e2.Display();
    }
}
