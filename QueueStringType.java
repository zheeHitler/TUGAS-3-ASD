import java.util.ArrayList;


public class QueueStringType {
    ArrayList<String> container =  new ArrayList<String>();
    int ecor = -1;
    
    public void insert(String value){
        ecor++; 
        container.add(ecor, value);
}
    public String get() {
        String value = "KOSONG";
        if(!container.isEmpty()){
            value = container.get(0);
            container.remove(0);
           ecor--;
        }
        return value;
        
    }
   
}
