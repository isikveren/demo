package com.api_03;
import java.util.Scanner;

public class StringTesy {
    public static void main(String[] args) {
        String username = "liuxunzi";
        String password = "123456";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            String s1 = sc.nextLine();
            System.out.println("请输入密码：");
            String s2 = sc.nextLine();

            if(s1.equals(username)&&s2.equals(password)){
                System.out.println("账号密码正确！登录成功！");
                break;}
            else
            {
                if(!s1.equals(username)){
                    System.out.println("请重新输入正确账号！");
                }
                if(!s2.equals(password)){
                    System.out.println("密码错误！");
                }

            }
            if(i == 2){
                System.out.println("您的账户已被锁定，请与管理员联系！");
            }else {
                System.out.println("您剩余" + (2 - i) + "次重新输入的机会！");
            }}

    }
}
