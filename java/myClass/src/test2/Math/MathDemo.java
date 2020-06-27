package test2.Math;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(-10.12));
        System.out.println(Math.ceil(10.12));  //向上取整
        System.out.println(Math.floor(-10.12));//向下取整
        System.out.println(Math.floor(10.12));//向下取整
        System.out.println(Math.round(-10.12));
        System.out.println(Math.round(10.12));//四舍五入
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.pow(2, 2)); //求幂
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 100) + 1);
        }
    }
}
