package com.study;

import sun.reflect.generics.tree.VoidDescriptor;

public class BinnNum {

    public static void main (String[] ags) {

        // reerse bin numbe 8

        int n = 0b00110000;
        int b = 255 - n;
        System.out.println(Integer.toBinaryString(b));
    }
}
