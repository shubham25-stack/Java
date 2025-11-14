class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadOne: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadTwo: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MT {
    public static void main(String[] args) {

        // Create objects of both threads
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start both threads
        t1.start();
        t2.start();

        // Main thread also running
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}