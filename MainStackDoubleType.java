public class MainStackDoubleType {
    public static void main(String[] args){
        StackDoubleType DBL = new StackDoubleType();
        
        
        
        DBL.push(90.0);
        DBL.push(70.0); 
        DBL.push(95.0);
        
        double Z1 = DBL.pop(); 
        double Z2 = DBL.pop(); 
        double Z3 = DBL.pop(); 
        double Z4 = DBL.pop();  
        System.out.println("HASIL DOUBLE :");
        System.out.println(" 1 : " +Z1);
        System.out.println(" 2 : " +Z2 );
        System.out.println(" 3 : " +Z3 );
        System.out.println(" 4 : " +Z4);
    }
}