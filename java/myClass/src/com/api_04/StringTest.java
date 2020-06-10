package com.api_04;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();
        int shuzi = 0;
        int daxie = 0;
        int xiaoxie = 0;
        for(int i = 0;i<s1.length();i++){
            System.out.println(s1.charAt(i));  //.charAt()指定索引处的字符值 String类中成员方法

            if((s1.charAt(i)>='0')&&(s1.charAt(i)<='9')) shuzi ++;
            if((s1.charAt(i)>='A')&&(s1.charAt(i)<='Z')) daxie ++;
            if((s1.charAt(i)>='a')&&(s1.charAt(i)<='z')) xiaoxie ++;
        }
        System.out.println("统计字数：\n数字："+shuzi+"\n小写字母:"+xiaoxie+"\n大写字母："+daxie+"\nall:"+s1.length());
    }
}
