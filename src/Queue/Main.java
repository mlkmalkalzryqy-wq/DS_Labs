package Queue;

public class Main  {
    public static void main(String[] args) {
        SlinkedQueue<Integer> slqueue=new SlinkedQueue<Integer>();
        slqueue.enqueue(10);
        slqueue.enqueue(20);
        slqueue.enqueue(50);
        System.out.println("front is ="+slqueue.front());
        while (!slqueue.isEmpty()){
            System.out.println("element removerd:"+slqueue.dequeue());
        }


    }
}