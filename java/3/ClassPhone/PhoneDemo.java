

public class PhoneDemo {
    public static void main(String args[]){
        Phone p = new Phone();
        System.out.println(p.brand());

    }
    
}
public class Phone{
 
    
    //��Ա����
    String brand;
    int price;

    //��Ա����
   public void call(){
       System.out.println("��绰����");
   }
   public void sendMessage(){
       System.out.println("�����ţ�����");
   }
    


}