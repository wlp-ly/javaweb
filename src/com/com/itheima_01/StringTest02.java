package com.com.itheima_01;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));
          for(int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
