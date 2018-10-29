public class MainStackStringType {
    public static void main(String[] args){
        StackStringType STR = new StackStringType();
        
        
        
        STR.push("Mardianah");
        STR.push("Fazheerah"); 
        STR.push("Zulfahmi");
        
        String d1 = STR.pop(); 
        String d2 = STR.pop(); 
        String d3 = STR.pop(); 
        String d4 = STR.pop(); 
        System.out.println("NAMA 1 : " +d1);
        System.out.println("NAMA 2 : " +d2 );
        System.out.println("NAMA 3 : " +d3 );
        System.out.println("NAMA 4 : " +d4);
    }
}