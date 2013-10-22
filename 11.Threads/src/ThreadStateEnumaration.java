/**
 * User: Rafa
 * Date: 27/09/13
 * Time: 08:10 PM
 */
public class ThreadStateEnumaration {
    public static void main(String []s) {
        for(Thread.State state : Thread.State.values()){
            System.out.println(state);
        }
    }
}
