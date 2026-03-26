
package Threads;

public class Company {

    int n;
    boolean f = false;

    synchronized public void produce_items(int n) {

        if (f) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() {

        if (!f) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}