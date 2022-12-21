package com.study;

public class splitString {



    public static void main(String args[]){

        String test = "{TEST-Vx5fJ_EpRFOFKgFR9f1rYw=TEST-_GmwXo9nSUqdzkZP0WPNdw|TEST-r-dcLVP8SWOF40aHDu2eLQ=TEST-BRUjK5yOToqPbvUb3pzsnA}";
        String domains1[] = test.split("\\{|}");
        String domains2[] = domains1[1].split("\\|");
        String val[] = test.split("\\|");
        System.out.println(domains2.length);
    }
}
