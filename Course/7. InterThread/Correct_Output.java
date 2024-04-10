import java.io.*;
class Total_Earning extends Thread
{
    
    int total = 0 ;
    public void run() 
    {
        synchronized(this)
    {
    for(int i=0; i<10; i++)
    {
        total += 100; 
    }
    this.notify();
    }
    }
}
public class Correct_Output
{
    public static void main(String args[])
    {
        try{
        Total_Earning obj = new Total_Earning();
        obj.start();
        synchronized(obj)
        {
            obj.wait();
            System.out.println(obj.total);
        }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}