//String Concatenation and substring from string methods.

public class Stringmethods3
{
    public static void main(String[] args)
    {
        String S1 = "Aman Kumar";
        String S2 = " Pandey";
        String S3 = "Akansha";

        // Use plus operator.
        System.out.println(S1+S2); //Aman Kumar Pandey
        System.out.println(S3 + 10); //Akansha10
        System.out.println(S3 + 10 + 20); //Akansha1020
        System.out.println(10 + 20 + S3); //30Akansha
        System.out.println(10 + S3 + 20); //10Akansha20
        System.out.println(S3 + 100/20); //Akansha5
        //System.out.println(S1 + 10 - 5); //error

        // Concat() method concatenates one string to the end of another string.
        System.out.println(S1.concat(S2)); //Aman Pandey

        //Join(CharSequence delimiter, CharSequence... elements)is a static method which concatenates the gien elements with the delimiter and returns the concatenated string. It was included in JDK 1.8 Version.
        //Note:- If an element is null , then null is added and if deliniter is null then it will throw "java.lang:NullPointerException"
        System.out.println(String.join(":",S1,S2,S3));

        //subSequence(int beginIndex, intEndIndex) method returns a CharSequence,
        //It throws java.lang.StringIndexOutofBoundsException if any index position value is negative.
        System.out.println(S1.subSequence(3,8)); //returns CharSequence Value

        //Threr are 2 substring() methods.
        System.out.println(S1.substring(3));//returns String value.
        System.out.println(S2.substring(3,5));//returns String value.
    }
}