public class Stringmethods5
{
    public static void main(String[] args)
    {
        String S1 = "Aman Kumar pandey";

        //indexIf() method.
        System.out.println(S1.indexOf("Ku")); // If we pass wrong argument in it, it will return -1.
        // e.g., System.out.println(S1.indexOf("Nu")); It will return -1.

        //lastIndexOf() method.
        System.out.println(S1.lastIndexOf("d"));

        //charAt() method.
        System.out.println(S1.charAt(3));

        //contains() method return boolean.
        System.out.println(S1.contains("pandey"));

        //startsWith() method returns boolean.
        System.out.println(S1.startsWith("d"));

        //endsWith() method returns boolean.
        System.out.println(S1.endsWith("y"));




    }
}