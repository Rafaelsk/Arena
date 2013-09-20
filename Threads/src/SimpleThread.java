/**
 * User: rrobles
 * Date: 20/09/13
 * Time: 11:19
 */
class SimpleThread {
    public static void main(String []s) {
        Thread t = new Thread();
        t.setName("Hilo");
        t.setPriority(9);
        System.out.println(t);
    }
}