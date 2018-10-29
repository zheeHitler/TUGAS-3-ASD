import java.util.ArrayList;

public class StackDoubleType {

    ArrayList<Double> container = new ArrayList<Double>();
    int top = -1;

    public void push(Double value) {
        top = top + 1;
        container.add(top, value);
    }

    public Double pop() {
        double value = 0 ;
        if(top>-1){
        value = container.get(top);
        container.remove(top);
        top = top - 1;
        }
       
        return value;

    }
}