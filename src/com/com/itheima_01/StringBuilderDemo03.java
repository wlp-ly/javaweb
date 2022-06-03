package com.com.itheima_01;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = myReverse(line);
        System.out.println(s);

    }

    public static String myReverse(String s) {
        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;*/
        return new StringBuilder(s).reverse().toString();
    }
}
