package com.OuterInner2;

public class  Outer {
    private int num = 10;

    public void methon(){
        Interface ii = new Interface(){
            @Override
            public void show() {
                System.out.println(num);
            }
        };

        ii.show();

    }
}
