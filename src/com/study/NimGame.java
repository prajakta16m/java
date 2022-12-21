package com.study;

/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

The game of Nim is played as follows. Starting with three heaps, each containing a variable number of items, two players take turns removing one or more items from a single pile.
The player who eventually is forced to take the last stone loses. For example, if the initial heap sizes are 3, 4, and 5, a game could be played as shown below:

  A  |  B  |  C
-----------------
  3  |  4  |  5
  3  |  1  |  3
  3  |  1  |  3
  0  |  1  |  3
  0  |  1  |  0
  0  |  0  |  0
In other words, to start, the first player takes three items from pile B. The second player responds by removing two stones from pile C.
The game continues in this way until player one takes last stone and loses.

Given a list of non-zero starting values [a, b, c], and assuming optimal play, determine whether the first player has a forced win.
 */

public class NimGame {

    public static char getXOR(char a, char b) {
        if(a == '0' && b == '0') {return '0';}
        if(a == '0' && b == '1') {return '1';}
        if(a == '1' && b == '0') {return '1';}
        if(a == '1' && b == '1') {return '0';}
        return '1';
    }

    public static void main(String args[]){

        System.out.println("Starting nim game...");

        int[] input = {3, 4, 5};
        char[] ans = new char[input.length];

        // Find 'Nim sum' of each individual heap count, and then nim sum of all.
        // Player who starts on non-zero count, can reduce it to 0. But Player starting on 0 cannot reduce to 0.
        // So Player who starts on non-zero will be the last player.
        // Nim Sum is nothing but XOR
        // 1+1 = 0 , 1+0=1, 0+1=1, 0+0=0

        for(int i=0 ; i< input.length; i++){
            // Find binary of each value and then XOR all to get one final addition value.
            // input = { 11, 100, 101}  ->  {0, 1, 0} -> 1
            // If A starts, A will be last player
            char[] test = Integer.toBinaryString(input[i]).toCharArray();

            ans[i] = test[0];
            for(int j=1; j <= test.length-1; j++){
                if(j+1 == test.length-1)
                {ans[i] = getXOR(ans[i], getXOR(test[j], test[j+1])); break;}
                else
                    ans[i] = getXOR(ans[i], test[j]);
            }
        }

        char finalans = ans[0];
        for(int j=1; j <= ans.length-1; j++){
            if(j+1 == ans.length-1)
            {finalans = getXOR(finalans, getXOR(ans[j], ans[j+1])); break;}
            else
                finalans = getXOR(finalans, ans[j]);
        }
        System.out.println(finalans);

        if(finalans == '1'){
            System.out.println("A will be last player and hence he will lose.");
        } else {
            System.out.println("B will be last player and hence she will lose.");
        }
    }
}
