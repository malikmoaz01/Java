class MultipleThreads implements Runnable 
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
    public static void main(String args[])
    {
        
        System.out.println("Total Number of Thread is 3 (2 ur & One in Main from Thread Class)");
        MyThread_Runnable t1 = new MyThread_Runnable();
        Thread tt = new Thread(t1);
        tt.start();
        MyThread_Class t2 = new MyThread_Class();
        Thread tt1 = new Thread(t2);
        tt1.start();


    }
}
