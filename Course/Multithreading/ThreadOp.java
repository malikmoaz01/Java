class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadOp {
    public static void main(String args[]) {
        int sum = 98 + 12;
        System.out.println(sum);

        // Name & Rename of Current Thread
        Thread mainThread = Thread.currentThread();
        String mainThreadName = mainThread.getName();
        System.out.println("Main Thread Name: " + mainThreadName);
        
        mainThread.setName("Malik"); 
        // Printing the name after renaming
        System.out.println("Main Thread New Name: " + mainThread.getName());
        
        // Set priority of the main thread
        mainThread.setPriority(Thread.MAX_PRIORITY); // or any other priority

        // Create another thread
        MyThread childThread = new MyThread();
        childThread.start();
        try {
            childThread.join(); // Wait for child thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Set priority of the child thread
        childThread.setPriority(Thread.MIN_PRIORITY); // or any other priority
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Ended");
    }
}
