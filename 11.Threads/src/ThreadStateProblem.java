/**
 * User: Rafa
 * Date: 27/09/13
 * Time: 08:12 PM
 */
class ThreadStateProblem extends Thread {
    public synchronized void run() {
        try {
            wait(1000);
        }
        catch(InterruptedException ie) {
            // its okay to ignore this exception since we're not
            // interrupting exceptions in this code
            ie.printStackTrace();
        }
    }

    public static void main(String []s) {
        new ThreadStateProblem().start();
    }
}

