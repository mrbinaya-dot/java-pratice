package Threads;

public class Company {
      int n;
     synchronized public void produce_items(int n) {
        this.n = n;
        System.out.println("produced : "+ this.n);
    }
    synchronized public int consume_item(){
        System.out.println("Consumed :" + this.n);
        return this.n;
    }


}
