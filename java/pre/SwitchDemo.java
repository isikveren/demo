import java.util.Scanner;


public class SwitchDemo {
    public static void main(String args[]){
        System.out.print("BEGIN!!\n");

        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            System.out.print("\n星期几（数字）？\n");
            int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.print("星期一");
                break;
            case 2:
                System.out.print("星期二");
                break;
            case 3:
                System.out.print("星期三");
                break;
            case 4:
                System.out.print("星期四");
                break;
            case 5:
                System.out.print("星期五");
                break;
            case 6:
                System.out.print("星期六");
                break;
            case 7:
                System.out.print("星期日");
                break;
            case 10:
                System.out.print("准备退出！！");
                break;
            default:
                System.out.print("请输入1-7之间的数字。");
        }   
        if(week == 10) break;
    }


    }    
}