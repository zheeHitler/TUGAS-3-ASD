public class MainQueueDoubleType {
    public static void main(String[] args){
        QueueDoubleType q = new  QueueDoubleType();
     
        
        q.insert(90.0);
        q.insert(80.0);
        q.insert(70.0);
       
        System.out.println("HASIL DOUBLE :");
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
