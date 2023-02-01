package com.study;

import java.util.Arrays;

public class Sorting {

    public static int[] selectionSort(int[] a) {
        int[] result = new int[0];

        int min;
        for(int i=0; i<a.length; i++) {
            min = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[min]>a[j]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }

        return a;
    }

    public static void main (String[] args) {

        int[] input = {64, 25, 12, 22, 11};

        int[] output = selectionSort(input);

        System.out.println(Arrays.toString(input));

    }
}
