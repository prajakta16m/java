package com.study;

public class BinarySearch {

    public static int getAnswer(int[] in,int k){

        int ans = 1;
        int l = in.length;
        ans =    l;

        int low, high, mid;
        high  = l-1;
        low = 0;
        mid = (high - low) / 2;

        while(low <= high){

            if(k < in[mid]){
                high = mid -1;

            } else {
                low = mid + 1;
            }
            mid = low + ((high - low) / 2);
            if(in[mid] == k){
                break;
            }
        }


        return mid;
    }

    public static void main(String[] args){

        // do binary search - input sorted array
        int[] input = { 12, 15, 21, 25, 30, 43, 47, 51, 58, 60, 63, 67, 71, 78, 99 };
        int find = 12;

        // ans 6

        int ans = getAnswer(input,find);
        System.out.println(ans);

    }
}
