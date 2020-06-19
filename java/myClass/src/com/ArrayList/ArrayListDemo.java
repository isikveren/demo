package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("hello");         //在集合最后插入元素
        array.add(0,"world");       //在指定位置插入元素
        array.add("Lisa");
        array.add("Maxswell");
        System.out.println("array:"+array);

        System.out.println("array deleted:"+array.remove(1));
        System.out.println("array deleted:"+array);
        System.out.println(array.set(1,"olleh"));
        System.out.println("array changed:"+array.get(1)+"size:"+array.size());
    }
}

