package com.com.itheima_01;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "itheima";
        String password = "czbk";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入姓名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败，你还有"+(2-i)+"次机会");
            }
        }

    }
}
