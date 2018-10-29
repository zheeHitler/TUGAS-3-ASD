import java.util.Vector;


public class StackGenericType<E> {
    private Vector<E> stack;
    private int top = -1; 

    public StackGenericType() {
        stack = new Vector<E>();
    }

    public void push(E obj) {
        stack.add(obj);
        top++;
    }

    public E pop() {
        if (top == -1) {
            return null; 
        }
        E temp = stack.get(top);
        stack.remove(top);
        top--;
        return temp;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size() {
        return top+1;
    }
}