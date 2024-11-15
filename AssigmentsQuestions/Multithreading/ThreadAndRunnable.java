// ThreadAndRunnable.java

// Creating a thread by extending the Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread by extending Thread class: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread by implementing Runnable interface: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadAndRunnable {
    public static void main(String[] args) {
        // Creating and starting the thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting the thread by implementing Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}