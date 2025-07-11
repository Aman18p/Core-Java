//Program to find Maximum Occurring Character in String.

public class StringPrograme3
{
    public static void main(String[] args)
    {
        String S = "this is demo";
        //To remove spaces b/w the Characters
        // S=S.replaceAll("\\s","");
        //System.out.println(S);

        int arr[] = new int[127];

        for (int i = 0; i < S.length(); i++)
        {
            arr[S.charAt(i)] = arr[S.charAt(i)]+1;
        }
        int max=-1;
        char c=' ';

        for (int i = 0; i < S.length(); i++)
        {
            if(max<arr[S.charAt(i)])
            {
                max=arr[S.charAt(i)];
                c=S.charAt(i);
            }
        }
        System.out.println(" Maximum Occurring Character is " + c);
    }
}