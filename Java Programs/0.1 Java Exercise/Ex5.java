// Question- Write a program to find Area of Rhombus in JAVA?
// package Unit1;s

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner P5= new Scanner(System.in);
        System.out.println("Enter D1 of Rhombus" );
        int D1= P5.nextInt();
        System.out.println("Enter D2 of Rhombus");
        int D2= P5.nextInt();

        int Area= ((D1*D2)/2);
        System.out.println(Area);
    }
    
}
