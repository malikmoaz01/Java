import java.io.*;
class Total_Earning extends Thread
{
    
    int total = 0 ;
    public void run() 
    {
    for(int i=0; i<10; i++)
    {
        total += 100; 
    }
    }
}
public class Error_Output
{
    public static void main(String args[])
    {
        Total_Earning obj = new Total_Earning();
        obj.start();
        System.out.println(obj.total); // It Should be Print 1000 
        // But here print 0 because of firstky main thread will come 
        // Thats a problem in Inter Thread Communication
        // Thats we use wait & Notify 
        // Jab Thread 0 wala execute na hujaye tab tak main wait kre 
    }
}