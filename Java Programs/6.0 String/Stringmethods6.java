//Case Conversion and Type Conversion.

public class Stringmethods6
{
    public static void main(String[] args)
    {
        String S1 = "aman";
        String S2 = "AMAN";
        int I1 = 10;

        // Case Conversion.
        // toUpperCase() method.
        System.out.println(S1.toUpperCase());
        //toLowerCase() method.
        System.out.println(S2.toLowerCase());

        //Type Conversion.
        // valueOf() method converts different type of elements into String.
        String S3 = String.valueOf(I1);
        System.out.println(S3);

        //toCharArrey() method converts the given string into a sequence of Characters.
        char[] C1 = S2.toCharArray();
        System.out.println(C1);


    }
}