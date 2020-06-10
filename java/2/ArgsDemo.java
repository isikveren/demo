public class ArgsDemo {
    public static void main(String args[]){
        int number = 100;
        System.out.println(number);
        number = change(number);
        System.out.println(number);
    }
    public static int change(int number){
        number += 200;
        return number;
    }
    
}