// Methods to check the string object is empty or not.

public class Stringmethods1
{
    public static void main(String[] args)
    {
        String name = "Aman";
        String lastname = "  Pandey";

        // length() method will return the length of string in int.
        System.out.println(name.length()); //It will give null pointer exception if value of string is null.

        // isempty() method will return boolean.
        System.out.println(name.isEmpty());

        //trim() method will return string value.
        System.out.println(lastname.trim()); //trim method will eliminate only leading and trailing spaces
    }
}