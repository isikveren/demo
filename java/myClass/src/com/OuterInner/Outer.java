package com.OuterInner;

public class Outer {
    private int num = 10;

    private class Inner {
        public void show(){
            System.out.println(num);
        }

    }
    public void methon(){
        Inner in = new Inner();
        in.show();
    }
}
