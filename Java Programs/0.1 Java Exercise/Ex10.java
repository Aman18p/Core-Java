//Question- Program for display camel case in java.



import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner P10= new Scanner(System.in);
        String Text= P10.next();
        String[] Words= Text.split("[A-Z]");
        System.out.println(Words.length);
    }
    
}
