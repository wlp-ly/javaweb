package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String>  array=new ArrayList<String>();
        array.add("华为");
        array.add("小米");
        array.add("格力");
      for(int i=0;i<array.size();i++){
          String s=array.get(i);
          System.out.println(s);
      }
    }
}
