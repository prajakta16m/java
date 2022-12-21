package com.study;

/*
    This problem was asked by Microsoft.

    Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances.
    And in every even call of getInstance(), return the first instance and in every odd call of getInstance(), return the second instance.
 */

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class MySingleton implements Cloneable, Serializable {

    private static MySingleton singleTonInstance;
    private static AtomicInteger counter = new AtomicInteger(0);

    private MySingleton() {
    }

    public static class EvenHelper {
        static MySingleton instance = new MySingleton();
    }

    public static class OddHelper {
        static MySingleton instance = new MySingleton();
    }

    public static MySingleton getInstance() {

        if(counter.getAndIncrement() % 2 != 0 ) {
            System.out.println(counter + " Even Instance");
            return EvenHelper.instance;
        } else {
            System.out.println(counter + " Odd Instance");
            return OddHelper.instance;
        }
    }


    public static void main( String[] args){
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
        MySingleton.getInstance();
    }
}
