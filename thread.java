class MyThread extends Thread{
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("Thread : " + Thread.currentThread().getName() + " Count : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Interrupted");
            }
        }
    }
}

class SimpleThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
} 
//make changes  for just github