/**
 * User: rrobles
 * Date: 20/09/13
 * Time: 11:25
 */
class BasicThreadStates extends Thread {
    public static void main(String []s) throws Exception {
        Thread t = new Thread(new BasicThreadStates());
        System.out.println("Just after creating thread; \n" +
                " The thread state is: " + t.getState());
        t.start();
        System.out.println("Just after calling t.start(); \n" +
                " The thread state is: " + t.getState());
        t.join();
        System.out.println("Just after main calling t.join(); \n" +
                " The thread state is: " + t.getState());
    }
}