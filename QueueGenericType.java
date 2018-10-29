import java.util.Vector;


public class QueueGenericType<E> {
    private Vector <E> queue = new Vector<E>();
    
    public QueueGenericType()
    {    
    }
    
    public void insert (E obj)
    {
          queue.add(obj);
    }
    
    public boolean isEmpty()
    {
       return queue.size() == 0 ;
    } 
    public E remove()
    {
        if (isEmpty())
        {
            return null;
           
        }
        return queue.remove(0);
    }
}
