// Methods for String Comparision.
// equal() and equalsIgnoreCase() methods will return in boolean.
// compareTo() and compareToIgnoreCase() methods will return in int.
public class Stringmethods2
{
    public static void main(String[] args)
    {
        String S1 = "Aman";
        String S2 = "Anurag";
        String S3 = "Aman";
        String S4 = "anuRag";
        String S5 = "ABC";
        String S6 = "abc";

        //equals() method compares the opject.
        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));

        //equalsIgnoreCase() methods compares the 2 strings by ignoring case considration.
        System.out.println(S2.equalsIgnoreCase(S4));

        //compareTo() method compares the 2 string Lexicographically.
        System.out.println(S5.compareTo(S6));

        //compareToIgnoreCase() method compares the 2 strings by ignoring case considration.
        System.out.println(S5.compareToIgnoreCase(S6));
    }
}