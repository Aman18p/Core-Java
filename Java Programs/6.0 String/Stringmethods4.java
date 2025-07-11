//Methods to update String.

public class Stringmethods4
{
    public static void main(String[] args)
    {
        //replace(char oldchar, char newchar) method
        String S1 = "Aman18p@gmail.com";
        System.out.println(S1.replace("18","17"));

        //replacefirst(String regex, String replacement) method.
        System.out.println(S1.replaceFirst("ma", "na"));

        //replaceAll(String regex, String replacement) method.
        String S2 = "Aman Pandey";
        System.out.println(S1.replaceAll("ma", "na"));
        System.out.println(S2.replaceAll("an(.)", "na")); //regex:- regular expression
        System.out.println(S2.replaceAll("ma(.*)", "na")); //regex:- regular expression
    }
}