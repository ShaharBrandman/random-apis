import java.util.LinkedList;
import java.util.EmptyStackException;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public Stack() {
        
    }

    public Stack(T first) {
        this.list.push(first);
    }

    public int size() {
        return this.list.size();
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public void push(T next) {
        this.list.addLast(next);
    }

    public T peekFirst() {
        if (this.list.size() == 0) {
            throw new EmptyStackException();
        }

        return this.list.peekLast();
    }

    public T pop() {
        if (this.list.size() == 0) {
            throw new EmptyStackException();
        }

        return this.list.removeLast();
    }
}