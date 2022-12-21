package com.study;

/*
    Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by ‘0’ or ‘1’.
    ex: 23??7? - how many combinations are possible ? print the number.
 */
public class July8 {

    public static void replace( String str, int idx){

        if(str.charAt(idx) == '?'){
            //str[idx] = 0;
        }

    }


    public static void main(String[] args){
        String input = "23??7?";

        replace(input,0);

    }
}
