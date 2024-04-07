class MyThread_Runnable implements Runnable 
{
    public void run()
    {
        for(int i=10; i>1; i--)
        {
            System.out.println("Value of i is " + i);
            try 
            {
                Thread.sleep(1000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    // public static void main(String args[])
    // {
    //     MyThread_Runnable t1 = new MyThread_Runnable();
    //     Thread tt = new Thread(t1);
    //     tt.start();
    // }
}
