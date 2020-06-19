package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("你好");
        System.out.println("array.get():");
        for(int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }


}
