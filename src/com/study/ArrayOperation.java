package com.study;

public class ArrayOperation {


    /* Given a list of integers in sorted order, say, [-9, -2, 0, 2, 3], we have to square each element and return the result in a sorted order. So, the output would be: [0, 4, 4, 9, 81]. */
    public static void pointerMethod(){
        int[] inputArr = {-9, -2, 0, 2, 3};
        int i = 0, j = inputArr.length -1;
        int len = inputArr.length;
        int[] outputArr = new int[len];

        while(j >= i){
            if(Math.abs(inputArr[i]) >= Math.abs(inputArr[j])){
                outputArr[--len] = (inputArr[i] * inputArr[i]); i++;
            } else {
                outputArr[--len] = (inputArr[j] * inputArr[j]); j--;
            }
        }
        System.out.println(java.util.Arrays.toString(outputArr));

    }


    /*
        Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1.
        Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative.
     */
    public static int getFixedPoint(int[] arr, int low, int high){

        int res = -1;
        if(high >= low){
            int mid = low + (high - low)/2;
            if(mid == arr[mid]) return mid;

            if(mid < arr[mid] ){
                res = getFixedPoint(arr, low, mid-1);
                return res;
            }
            if(mid > arr[mid]){
                res = getFixedPoint(arr, mid+1, high);
            }

        }
        return res;
    }

    public static void main(String[] args){
        System.out.println("lets go ... ");
        // pointerMethod();

        // int[] input =   {-10, -1, 0, 3, 10, 11, 30, 50, 100 };
        int[] input = {-1,0,1,2,4};
        int ans = getFixedPoint(input, 0 , input.length-1);

        System.out.println("Fixed point is  = "+ans);

    }
}
