package test2;

public class diguiqiuhe {
    public static void main(String[] args) {
        int n = 100;
        n = Sum(100);
        System.out.println(n);
    }
    public static int Sum(int n){
        if(n == 1) return 1;
        else return n + Sum(n-1);
    }
}
