// Here's a list of all the commonly used methods:-
//(1) e.printStackTrace();
//(2) System.out.println(e);
//(3) e.getMessage();
//(4) e.toString();

import java.io.*;

public class PrintExceptions
{
    public static void main(String[] args)
    {
        try
        {
            int a= 100;
            int b= 0;
            int c= a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e.toString()); // It prints Exception Name and Description.
            System.out.println("*********");

            System.out.println(e.getMessage()); //It prints Description only.
            System.out.println("*********");

            e.printStackTrace(); //It prints Exception Name, Description and StackTrace.
            System.out.println("*********");

            System.out.println(e); // It prints Exception Name and Description.
            System.out.println("*********");

            System.out.println("You Cannot divide by zero"); //It prints custome message.
        }
    }
}