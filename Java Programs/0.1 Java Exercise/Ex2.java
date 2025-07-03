//Question- Write a program to enter cost of pen from user and find cost of 50 pen cost with 10% discount?



import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner P2 = new Scanner(System.in);
        System.out.println("Enter the cost of Pen");
        int Kalam=P2.nextInt();

        int Total= (((Kalam * 50)*90)/100);
        System.out.println("Total Price of 50 pen cost with 10% discount" +" "+ Total);

    }
    
}
