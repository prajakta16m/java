package com.study;

/*
    Median can be defined as the element in the data set which separates the higher half of the data sample from the lower half.
    In other words, we can get the median element as, when the input size is odd, we take the middle element of sorted data.
    If the input size is even, we pick an average of middle two elements in the sorted stream.
 */

public class MedianOfSequence {

    public static int[] insert(int[] arr, int n, int len){
        int[] returnArr = new int[len+1];
        for(int k = 0, q =0 ; k < len; q++){
            if(arr[k] < n){
                returnArr[q] = arr[k]; k++;
            } else{
                returnArr[q] = n;
            }
        }
        return returnArr;
    }

    public static void main (String[] args) {

       /* int a = 2;
        int b = 3;
        float q = ((float)a)/b;
        System.out.println(q);*/

        int[] input = {2,1,5,7,2,0,5};

        for(int i = 0 ; i<input.length-1; i++){
            int j = i+1;

            if(input[j] < input[i]) {
                // inset in sorted array
                insert(input, input[j], j+1);
            }

            System.out.print('-');
            for(int x = 0 ; x <= j ; x++){
                System.out.print(input[x]);

            }
            System.out.println();

            if((j+1) % 2 == 0) {
                float y = ((float)input[j/2] + (float)input[(j+1)/2] ) /2;
                System.out.println( y );
            } else {
                int y = input[j/2];
                System.out.println(y);
            }
        }

    }
}
