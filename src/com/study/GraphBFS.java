package com.study;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GraphBFS {

    static class Graph {

        int V;
        LinkedList<Integer> adj[];

        Graph(Integer s){
            this.V = s;
            this.adj = new LinkedList[s];

            for(int i =0; i< s; i++){
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w){
            this.adj[v].add(w);
        }

        void BFS(int s) {
            int visited[] = new int[this.V];
           // LinkedList<Integer> queue = new LinkedList();
            Queue q = new PriorityQueue();

            visited[s] = 1;
            q.add(s);
            while(!q.isEmpty()){

                int x = (Integer) q.poll();
                System.out.print(x);

                Iterator i = adj[x].iterator();
                while(i.hasNext()) {
                    Integer n = (Integer) i.next();
                    if(visited[n] != 1) {
                        visited[n] = 1;
                           q.add(n);
                    }
                }

            }

        }

        void DFS(int n, boolean[] visited ) {

            visited[n] = true;
            System.out.print(n);

            Iterator i = adj[n].iterator();
            while(i.hasNext()) {
                int x = (Integer) i.next();
                if (!visited[x]) {
                    DFS(x, visited);
                }
            }

        }

    }

    public static void main (String[] args0){

        System.out.println("BFS - breadth first search for Graph");

        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.BFS(2);
        System.out.println();
        boolean y[] = new boolean[4];
        g.DFS(2, y);
    }
}
