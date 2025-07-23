// Synchronized Block.
//-Only a part of the method is synchronized using synchronized(object).
//-Useful when you want to synchronize only a portion of code instead of entire method.

public class SyncBlock
{
    int Total_Seats = 10;

    void bookSeat(int Seats)
    {
        System.out.println("Row1 Seat 1");
        System.out.println("Row1 Seat 2");
        System.out.println("Row1 Seat 3");
        System.out.println("Row1 Seat 4");
        System.out.println("Row1 Seat 5");
        System.out.println("Row1 Seat 6");
        System.out.println("Row1 Seat 7");
        System.out.println("Row1 Seat 8");
        System.out.println("Row1 Seat 9");
        System.out.println("Row1 Seat 10");
        synchronized (this)
        {
            if (Seats <= Total_Seats) {
                System.out.println(Seats + "Seats Booked Successfully");
                Total_Seats = Total_Seats - Seats;
            } else {
                System.out.println("Seats Cannot be booked now");
                System.out.println("Seats Left :" + Total_Seats);
            }
        }
    }
}

class MovieBookingApp extends Thread
{
    static SyncBlock SB;
    int Seats;

    public void run()
    {
        SB.bookSeat(Seats);
    }

    public static void main(String[] args)
    {
        SB = new SyncBlock();

        MovieBookingApp M1 = new MovieBookingApp();
        M1.Seats = 7;
        M1.start();

        MovieBookingApp M2 = new MovieBookingApp();
        M2.Seats = 6;
        M2.start();

    }
}