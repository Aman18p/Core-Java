// Question-Write a program to find area of rectangle in JAVA?




import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner P4= new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        int L=P4.nextInt();

        System.out.println("Enter the Width of Rectancle");
        int B=P4.nextInt();

        int Area=(L*B);
        System.out.println("Area of Rectangle is"+" "+ Area);
    }
    
}
