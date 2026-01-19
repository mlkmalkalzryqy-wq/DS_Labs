package Queue;

import DoublyLinkedList.DoublyLinkedList;
import SinglyLinkedList.SinglyLinkedList;

public class DlinkedQueue<E> implements Queue<E> {
    DoublyLinkedList<E> dList =new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return dList.isEmpty();
    }


    @Override
    public int size() {
        return dList.size();
    }

    @Override
    public void enqueue(E data) {
        dList.addLast(data);

    }

    @Override
    public E dequeue() {
        return dList.removeFirst();
    }

    @Override
    public E front() {
        return dList.getFirst();
    }
}