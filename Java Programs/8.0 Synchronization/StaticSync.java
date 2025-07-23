// Static Synchronized Method.

public class StaticSync
{
    static int Total_Seats = 20;
    static synchronized void book_seats(int Seats)
    {
        if (Total_Seats >= Seats)
        {
            System.out.println(Seats + "Seats booked successfully");
            Total_Seats = Total_Seats - Seats;
            System.out.println(Total_Seats + "Seats Left");
        }
        else
        {
            System.out.println("Failed to Book Seats");
        }
    }
}

class Thread1 extends Thread
{
    StaticSync SS;
    int Seats;

    void Thread1(StaticSync SS ,int Seats)
    {
        this.SS = SS;
        this.Seats = Seats;
    }
    public void run()
    {
        SS.book_seats(Seats);
    }
}

class Thread2 extends Thread
{
    StaticSync SS;
    int Seats;

    void Thread1(StaticSync SS, int Seats)
    {
        this.SS = SS;
        this.Seats = Seats;
    }

    public void run()
    {
        SS.book_seats(Seats);
    }
}

class MovieBookingApp
{
    public static void main(String[] args)
    {
        StaticSync SS1= new StaticSync();

        Thread1 T1 = new Thread1();
        T1.Seats = 6;
        T1.start();

        Thread2 T2 = new Thread2();
        T2.Seats = 5;
        T2.start();

        StaticSync SS2 = new StaticSync();
        Thread1 T3 = new Thread1();
        T3.Seats = 7;
        T3.start();

        Thread2 T4= new Thread2();
        T4.Seats = 4;
        T4.start();
    }
}