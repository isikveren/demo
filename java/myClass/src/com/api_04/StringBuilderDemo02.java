package com.api_04;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int []arr ={1,2,3};
        String s = ats(arr);
        System.out.println(s);
        s = res(s);
        System.out.println(s);

    }
    public static String ats(int []arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<arr.length;i++){
            if(i == (arr.length - 1)) {
                sb.append(arr[i]);

            }else{sb.append(arr[i]).append(",");}
        }
        sb.append("]");
        return sb.toString();
    }
    public static String res(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }
}
