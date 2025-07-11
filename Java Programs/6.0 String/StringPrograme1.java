// Program to Reverse a String.
public class StringPrograme1
{
    public static void main(String[] args)
    {
        String S = new String("Aman Pandey");
        String Reverse = "";

        for (int i = S.length()-1; i >=0 ; i--)
        {
            Reverse = Reverse + S.charAt(i);
        }
        System.out.println(Reverse);
    }
}