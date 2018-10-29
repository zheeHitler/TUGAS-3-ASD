import java.util.ArrayList;


public class QueueFloatType {
    ArrayList<Float> FLOAT =  new ArrayList<Float>();
    float ecor = -1f;
    
    public void insert(Float value){
        ecor++; 
        FLOAT.add((int) ecor, value);
}
    public Float get() {
        float value = 0f;
        if(!FLOAT.isEmpty()){
            value = FLOAT.get(0);
            FLOAT.remove(0);
           ecor--;
        }
        return value;
        
    }
   
}