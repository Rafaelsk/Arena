/**
 * User: Rafael
 * Date: 6/10/13
 * Time: 15:09
 */
import java.util.concurrent.locks.*;
// This class simulates a situation where only one ATM machine is available and
// and five people are waiting to access the machine. Since only one person can
// access an ATM machine at a given time, others wait for their turn
class ATMMachine {
    public static void main(String []args) {
        // A person can use a machine again, and hence using a "reentrant lock"
        Lock machine = new ReentrantLock();
        // list of people waiting to access the machine
        new Person2(machine, "Mickey");
        new Person2(machine, "Donald");
        new Person2(machine, "Tom");
        new Person2(machine, "Jerry");
        new Person2(machine, "Casper");
    }
}
// Each Person is an independent thread; their access to the common resource
// (the ATM machine in this case) needs to be synchronized using a lock
class Person2 extends Thread {
    private Lock machine;
    public Person2(Lock machine, String name) {
        this.machine = machine;
        this.setName(name);
        this.start();
    }
    public void run() {
        try {
            System.out.println(getName() + " waiting to access an ATM machine");
            machine.lock();
            System.out.println(getName() + " is accessing an ATM machine");
            Thread.sleep(1000); // simulate the time required for withdrawing amount
        } catch(InterruptedException ie) {
            System.err.println(ie);
        }
        finally {
            System.out.println(getName() + " is done using the ATM machine");
            machine.unlock();
        }
    }
}