
public class MainQueueGenericType{
public static void main(String[] args){

    QueueGenericType <String> QGT = new QueueGenericType <String>();
    QGT.insert("ONE");
    QGT.insert("TWO");
    QGT.insert("THREE");
    
    System.out.println("HASIL QUEUE TIPE GENERIC :");
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
}

}