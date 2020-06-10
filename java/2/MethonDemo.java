import java.util.Scanner;
public class MethonDemo {

public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数i，判断的奇偶：");
        int i = sc.nextInt();
        System.out.println(isEvenNumber(i));
    }
    public static boolean isEvenNumber(int number){
        if(number %2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
