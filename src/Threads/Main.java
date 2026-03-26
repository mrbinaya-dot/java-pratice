package Threads;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        Consumer c = new Consumer(comp);
        Producer p = new Producer(comp);
        p.start();
        c.start();
    }
}
