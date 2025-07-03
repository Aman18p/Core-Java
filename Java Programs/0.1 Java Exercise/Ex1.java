//Question- Write a program to find sum of two integer number which is enter by user?


import java.util.*;

class Ex1{

    public static void main(String[] args) {
        
        Scanner P1 = new Scanner(System.in);
        System.out.println("Enter First no.");
        int Number1= P1.nextInt();

        
        System.out.println("Enter Second no.");
        int Number2= P1.nextInt();

        int Add=(Number1+Number2);

        System.out.println(Add);

    }
}