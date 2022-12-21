package com.study;

public class June6 {

    public static void main(String[] args){
        int[] k = {1,2,3,4,5,6};
        for(int i=0 ; i<k.length ; i++){
            k[i] = (k[i] + 2) <= 6 ? (k[i]+2) : (k[i]+2) % 6 ;
        }
        for(int j=0 ; j<k.length ; j++){
            System.out.print(k[j]);
        }
    }
}
