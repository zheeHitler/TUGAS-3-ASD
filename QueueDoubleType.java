import java.util.ArrayList;


public class QueueDoubleType {
    ArrayList<Double> container =  new ArrayList<Double>();
    double ecor = -1;
    
    public void insert(Double value){
        ecor++; 
        container.add((int) ecor, value);
}
    public Double get() {
        double value = 0;
        if(!container.isEmpty()){
            value = container.get(0);
            container.remove(0);
           ecor--;
        }
        return value;
        
    }
   
}
