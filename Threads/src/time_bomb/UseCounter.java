package time_bomb;

/**
 * User: rrobles
 * Date: 20/09/13
 * Time: 11:50
 */
// This class implements Runnable interface
// Its run method increments the counter three times
class UseCounter implements Runnable {
    public synchronized void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    public void run() {
        increment();
        increment();
        increment();
    }
}
