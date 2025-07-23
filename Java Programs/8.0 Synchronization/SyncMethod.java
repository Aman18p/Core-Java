// Synchronized Method.
//-Whole method is locked for only one thread at a time.
//-Only one thread can execute this method for an object at a time.

public class SyncMethod
{
    int Total_Seats = 10;

    synchronized void bookSeat(int Seats)
    {
        if (Seats <= Total_Seats)
        {
            System.out.println( Seats +"Seats Booked Successfully");
            Total_Seats = Total_Seats - Seats;
        }
        else
        {
            System.out.println("Seats Cannot be booked now");
            System.out.println("Seats Left :" + Total_Seats);
        }
    }
}

class MovieBookingApp extends Thread
{
    static SyncMethod SM;
    int Seats;

    public void run()
    {
        SM.bookSeat(Seats);
    }

    public static void main(String[] args)
    {
        SM = new SyncMethod();

        MovieBookingApp M1 = new MovieBookingApp();
        M1.Seats = 7;
        M1.start();

        MovieBookingApp M2 = new MovieBookingApp();
        M2.Seats = 6;
        M2.start();

    }
}
