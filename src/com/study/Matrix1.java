package com.study;

public class Matrix1 {

    public static void main ( String[] args ) {

        int[][] m = new int[4][4];
        m[0][0] = 1; m[0][1] = 0; m[0][2] = 0; m[0][3] = 0;
        m[1][0] = 1; m[1][1] = 0; m[1][2] = 1; m[1][3] = 1;
        m[2][0] = 1; m[2][1] = 0; m[2][2] = 1; m[2][3] = 1;
        m[3][0] = 0; m[3][1] = 1; m[3][2] = 0; m[3][3] = 0;

        for(int i=0; i <= 3; i++) {
            for( int j=0 ; j <=3 ; j++ ) {
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Find largest rectangle with 1s
        int p,q,r, c, k;
        int max = 0;
        for( int i=0 ; i< 4 ; i++) {
            for( int j=0 ; j < 4 ; j++ ) {
                p = i;
                q = j;
                r = 0; c = 1; k = 0;
                while ( p < 4 ) {
                    if(m[p][q] == 1 ) {
                        r++; p++;
                    } else { break; }
                }


                c = 1;

                int x = p-1 , y = q+1;
                while ( y < 4 ) {
                    while ( x >= 0 ) {
                        if(m[x][y] == 0){
                            x--;
                        }
                    }
                    if(x == -1 ) {
                        break;
                    }
                    c++;
                }
                max = (r*c > max) ? r*c : max;

                System.out.print("i = "+i);System.out.print(" ");
                System.out.print("j = "+j);System.out.print(" ");
                System.out.print("r = "+r);System.out.print(" ");
                System.out.print("c = "+c);System.out.print(" ");
                System.out.print("max = "+max);System.out.print(" ");
                System.out.println();
            }
        }

    }

}
