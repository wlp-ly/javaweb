package com.com.itheima_01;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        /*StringBuilder sb =new StringBuilder();
        sb.append("hello");

        //转化为string
        String s=sb.toString();
        System.out.println(s);*/


        String s="hello";
        //string转化为stringbuilder
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb);
    }
}
