package com.itheima_07;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
