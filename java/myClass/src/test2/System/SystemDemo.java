package test2.System;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        System.exit(1);
        System.out.println("结束");
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0;i<10;i++){
            System.out.println(i);
            delay();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start)+"ms");
    }
    public static void delay(){
        for(int i = 0;i<10000;i++){

    }}
}
