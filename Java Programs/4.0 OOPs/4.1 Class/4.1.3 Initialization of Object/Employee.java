//Initialization of object by using Constructors.

//The name of the constructor must be the same as the class name.
//It has no return type, not even void.
//Automatic call when object is created.
//You can define multiple constructors in a class with different parameters, allowing flexibility in object creation.

public class Employee
{
    String name;
    int emp_id;

    public Employee(String name, int emp_id)
    {
        this.emp_id = emp_id;
        this.name = name;
    }

    public static void main(String[] args)
    {
        Employee E1 = new Employee("Deepak",101);
        Employee E2 = new Employee("Aman", 102);
        System.out.println(E1.name +" "+E1.emp_id);
        System.out.println(E2.name +" "+E2.emp_id);

    }
}