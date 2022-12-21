package com.study;

public class RecursionProblems {


    /*
    * Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
        Only one disk can be moved at a time.
        Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
        No disk may be placed on top of a smaller disk.
    * */
    public static void doTowerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        if(n == 1){
            System.out.println("Move Disk "+n+" from "+fromRod+" to "+toRod);
            return;
        }
        doTowerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Move Disk "+n+" from "+fromRod+" to "+toRod);
        doTowerOfHanoi(n-1, auxRod, toRod, fromRod );
    }
    public static void towerOfHanoi(){

        int n = 5;
        doTowerOfHanoi(5, 'A', 'C', 'B');

    }

    public static void main(String[] args){
        towerOfHanoi();
    }
}
