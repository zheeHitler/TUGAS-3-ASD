public class MainQueueFloatType {
    public static void main(String[] args){
        QueueFloatType q = new  QueueFloatType();
     
        
        q.insert(98.0f);
        q.insert(89.0f);
        q.insert(78.0f);
       
        System.out.println("HASIL FLOAT :");
        double o1 = q.get();
        System.out.println(o1);
        double o2 = q.get();
        System.out.println(o2);
        double o3 = q.get();
        System.out.println(o3);
        double o4 = q.get();
        System.out.println(o4);
        
    }
    
}
