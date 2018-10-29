import java.util.ArrayList;

public class StackStringType {

    ArrayList<String> container = new ArrayList<String>();
    int top = -1;

    public void push(String value) {
        top = top + 1;
        container.add(top, value);
    }

    public String pop() {
        String value = "KOSONG";
        if(top>-1){
        value = container.get(top);
        container.remove(top);
        top = top - 1;
        }
       
        return value;

    }
}