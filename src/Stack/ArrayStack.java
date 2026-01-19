
package Stack;
public class ArrayStack<E> implements Stack<E> {
    private E []arr ;
    private int top=-1 ;
    static final int CAPICITY=1000;

    public ArrayStack() {
        this(CAPICITY);
    }
    public ArrayStack( int c) {
        arr=(E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return (size()==0);
    }
    @Override
    public int size() {
        return top+1;    }

    @Override
    public void push(E data) {
        if(size()==arr.length){
            System.out.println("Cant add more , Stack is full");
            // throw new IllegalStateException("Cant add more , Stack is full");
        }
        else {

            arr[++top]=data;

        }
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return arr[top];
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E delete=arr[top];
        arr[top]=null;
        top--;
        return delete;
    }
}
