package com.api_04;

public class StringTest02 {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        String s = arraytostring(arr);
        s = reserve(s);
        System.out.println(s);
    }/*
定义一个方法
    两个明确：返回值类型 参数
 */
    public static String arraytostring(int []arr){
        String s = "";
        s +='[';
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1)
                s += arr[i];
            else {
                s += arr[i];
                s += ", ";
            }

        }
        s +=']';

        return s;
    }

    public static String reserve(String s){
        String ss = "";
        for(int i = s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }
        return ss;

    }

}

