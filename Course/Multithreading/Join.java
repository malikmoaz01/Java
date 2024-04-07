class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Thread " + threadName + " is running.");
    }
}

public class Join {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[3];

        // Creating threads
        threads[0] = new MyThread("Thread 1");
        threads[1] = new MyThread("Thread 2");
        threads[2] = new MyThread("Thread 3");

        // Starting and joining threads in order
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            try {
                threads[i].join(); // Wait for the current thread to finish before starting the next one
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println("All threads have finished.");
    }
}
