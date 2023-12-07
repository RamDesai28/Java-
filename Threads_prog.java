class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // Create an instance of the custom thread class
        myThread.start(); // Start the thread

        // Code in the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}

