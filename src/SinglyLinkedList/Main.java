
package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        SinglyLinkedList<String> list2=new SinglyLinkedList<String>();

        list.addLast(10);
        list.addLast(40);
        list.addfirst(20);
        list.addLast(30);
        list.removeFirst();
        list.removeLast();
        list.display();


    }
}

