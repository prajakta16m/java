package gph;

// Given a graph, find its transitive closure.

public class close {

    public static  void main (String ags[]) {

        int[][] g = new int[][]{ {0,1,3} , {1,2}, {2}, {3} };


        int[][] a = new int[g.length][g.length];

        for (int i=0; i < g.length; i++) {

            for ( int j=0, k =0; j <  g.length  ; j++ ) {
                a[i][j] = 0;

                if(k < g[i].length) {

                    int p = g[i][k];
                    if (p == j) {
                        a[i][p] = 1;
                        k++;
                    }
                }


            }
        }

        for(int i=0; i< g.length; i++) {
            for ( int j=0; j < g.length ; j++ ) {
                System.out.print(a[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }

    }

}
