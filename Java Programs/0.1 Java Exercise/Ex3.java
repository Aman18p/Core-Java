//Question- Question- Write a program to find the area of circle?



import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner P3= new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int R1= P3.nextInt();

        double Area= (R1*R1* 3.14);
        System.out.println(Area);
    }
}
