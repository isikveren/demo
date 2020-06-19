package com.xiushifu;

public class Fu {
    public void show1(){
        System.out.println("public show1");
    }
    void show2(){
        System.out.println("show2");
    }
    private void show3(){
        System.out.println("private show3");
    }
    protected void show4(){
        System.out.println("protected show4");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
