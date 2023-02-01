package com.study;

public class StringProblems {

    public static String zigzagConversion(String s, int numRows) {
        int n = s.length() - 1;
        int f = 2*(numRows-1);

        String op = "";

        for(int i=0; i<numRows; i++) {

            int j = i;
            op = op + s.charAt(j);
            while((f*j) < n ) {
                if(i == 0 && j > 0 ) {
                    op = op + s.charAt(f * j);
                }
                if( i > 0 && i < numRows-1) {
                    op = op + s.charAt( (f * j) - i);
                    if(( (f * j) + i) <= n ) {
                        op = op + s.charAt( (f * j) + i);
                    }

                }
                if(i == numRows-1 && (f*(numRows-j) +j < n))  {

                    op = op + s.charAt(f*(numRows-j) +j);
                }

                j++;
            }
        }

        return op;
    }

    public static void main(String args[]) {
        String result = zigzagConversion("PAYPALISHIRING", 3);
        System.out.println(result);
    }
}
