/**
 * User: Rafa
 * Date: 07/10/13
 * Time: 09:12 PM
 */
import java.util.concurrent.ThreadFactory;

// A ThreadFactory implementation that sets the thread priority to max
// for all the threads it creates
class MaxPriorityThreadFactory implements ThreadFactory {
    private static long count = 0;
    @Override
    public Thread newThread(Runnable r) {
        Thread temp = new Thread(r);
        temp.setName("prioritythread" + count++);
        temp.setPriority(Thread.MAX_PRIORITY);
        return temp;
    }
}

class ARunnable implements Runnable {
    public void run() {
        System.out.println("Running the created thread ");
    }
}

class TestThreadFactory {
    public static void main(String []args) {
        ThreadFactory threadFactory = new MaxPriorityThreadFactory();
        Thread t1 = threadFactory.newThread(new ARunnable());
        System.out.println("The name of the thread is " + t1.getName());
        System.out.println("The priority of the thread is " + t1.getPriority());
        t1.start();
    }
}