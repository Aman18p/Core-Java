// Program to check Palindrome String.
public class StringPrograme2
{
    public static void main(String[] args)
    {
        String S = new String("VABAV");
        String Reverse = "";

        for (int i = S.length()-1; i >= 0 ; i--)
        {
            Reverse = Reverse + S.charAt(i);
        }

        if(S.equals(Reverse))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("not a Palindrome String");
        }
    }
}