// In encapsulation, the variables of a class will be hidden from other classes, and can be assessed only through the methods of their current class. This concept is known as Data hiding.
// Steps to achieve encapusalation-
// 1) Declare the variables of a class as private.
// 2) Provide public setter and getter methods to modify and view the variables values.

class Employee
{
    private int emp_id;
    public void setEmp_id(int eid)
    {
        emp_id = eid;
    }
    public int getEmp_id()
    {
        return emp_id;
    }
}
class Company
{
    public static void main(String[] args)
    {
        Employee E = new Employee();
        E.setEmp_id(101);
        System.out.println(E.getEmp_id());
    }
}