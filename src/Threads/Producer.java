package Threads;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while(true) {
            c.produce_items(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            i++;
        }
    }
}
