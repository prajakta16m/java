package com.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Palindrome {

    public static void main (String[] args) {

        String ip = "geeksogeeks";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0 ;i< ip.length(); i++) {

            if(hm.containsKey(ip.charAt(i))) {
                int val = hm.get(ip.charAt(i));
                hm.put(ip.charAt(i), ++val);
            } else {
                hm.put(ip.charAt(i), 1);
            }
        }

        System.out.println(hm);

        Iterator hmIt = hm.entrySet().iterator();

        boolean isOdd = false;
        int oddEntry = 0;
        while(hmIt.hasNext()) {
            System.out.println();
            Map.Entry<Character, Integer> hmTemp = (Map.Entry)hmIt.next();
            int val = hmTemp.getValue();
            if(val % 2 == 1) {
                isOdd = true;
                oddEntry++;
            }
        }
        if( (ip.length() % 2 == 0 && !isOdd ) || (ip.length() % 2 == 1 && isOdd && oddEntry == 1) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
