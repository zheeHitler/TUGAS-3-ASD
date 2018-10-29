import java.util.ArrayList;

public class StackFloatType {

    ArrayList<Float> container = new ArrayList<Float>();
    int top = -1;

    public void push(Float value) {
        top = top + 1;
        container.add(top, value);
    }

    public Float pop() {
        float value = 0f ;
        if(top>-1){
        value = container.get(top);
        container.remove(top);
        top = top - 1;
        }
       
        return value;

    }
}