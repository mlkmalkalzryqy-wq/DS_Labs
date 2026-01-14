
package CircualrLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist=new CircularLinkedList<>();
        clist.addFirst("Hasan");
        clist.addFirst("Taher");
        clist.addFirst("Emad");
        clist.addLast("Mustafa");
        clist.addLast("Hussin");
        clist.removeFirst();
        clist.removeLast();
        clist.display();

    }
}

