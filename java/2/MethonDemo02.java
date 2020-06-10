import java.util.Scanner;
public class MethonDemo02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt(),y = sc.nextInt(),z = sc.nextInt();
        int sum1 = addNumbers(x, y);
        int sum2 = addNumbers(x, y, z);
        System.out.println(sum1);
        System.out.println(sum2);

    }
    public static int addNumbers(int a,int b){
        return a+b;
    }
    
    public static int addNumbers(int a,int b,int c){
        return a+b+c;
    }


    
}