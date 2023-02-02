package com.study;
// Thread start() creates a new Thread and run() runs the existing thread !
public class Threads {

    class Thread1 extends Thread {
        public void run(){
            System.out.println("This is thread 1 : "+Thread.currentThread().getName());
        }
    }

    class Thread2 implements Runnable {
        public void run () {
            System.out.println("This is thread 2 : "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Threads tt = new Threads();

        Thread1 t1 = tt.new Thread1();
        Thread2 t2 = tt.new Thread2();

        t1.start();
        t2.run();
    }
}
