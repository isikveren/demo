package com.ExtendDemo;

public class Zi extends Fu{
    //身高
    public int heigh = 175;
    public int age = 30;

    public Zi(){
        super(20);
        System.out.println("Zi中无参构造方法被调用！");
    }

    public Zi(int age){
        super(20);
        System.out.println("Zi中有参构造方法被调用！");
    }

    public void show(){
        super.show();
//        int age = 40;
//        System.out.println(heigh);
//        System.out.println("age:"+age);
//        System.out.println("this.age:"+this.age);
//        System.out.println("访问父类的成员变量age："+super.age);


    }
    public void methon(){

        System.out.println("zi methon方法被调用！");
    }
}
