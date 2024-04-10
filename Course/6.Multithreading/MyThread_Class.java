class MyThread_Class extends Thread
{
    public void run()
    {
        for(int i=1; i<10; i++)
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
    //     MyThread_Class t1 = new MyThread_Class();
    //     Thread tt = new Thread(t1);
    //     tt.start();
    // }
}
