

public class PhoneDemo {
    public static void main(String args[]){
        Phone p = new Phone();
        System.out.println(p.brand());

    }
    
}
public class Phone{
 
    
    //成员变量
    String brand;
    int price;

    //成员方法
   public void call(){
       System.out.println("打电话！！");
   }
   public void sendMessage(){
       System.out.println("发短信！！！");
   }
    


}