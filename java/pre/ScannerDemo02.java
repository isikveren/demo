import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("请输入第一个和尚的体重:");
        int height1 = sc.nextInt();
        System.out.print("请输入第二个和尚的体重：");
        int height2 = sc.nextInt();
        System.out.print("请输入第三个和尚的体重：");
        int height3 = sc.nextInt();
        int tempHeight,maxHeight;
        tempHeight = (height1 > height2)? height1:height2;
        maxHeight = (tempHeight > height3)?tempHeight:height3;
        System.out.print("maxHeight  =  "+maxHeight);
    }
    
}