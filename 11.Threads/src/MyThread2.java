/**
 * User: rrobles
 * Date: 20/09/13
 * Time: 11:19
 */
class MyThread2 implements Runnable {
    public void run() {
        System.out.println("In run method; thread name is: " +
                Thread.currentThread().getName());
    }
    public static void main(String args[]) throws Exception {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
        System.out.println("In main method; thread name is: " +
                Thread.currentThread().getName());
    }
}
