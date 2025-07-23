public class TotalEarningApp extends Thread
{
    int Total = 0;

    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i <= 10; i++)
            {
                Total = Total +100;
            }
            this.notify();
        }
    }
}

class MovieBookApp
{
    public static void main(String[] args) throws Exception
    {
        TotalEarningApp T = new TotalEarningApp();
        T.start();

        synchronized (T)
        {
            T.wait();
            System.out.println("TotalEarning : " + T.Total + "Rs");
        }
    }
}