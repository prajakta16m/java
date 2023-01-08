package com.study;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

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
            LinkedList<Integer> queue = new LinkedList();

            visited[s] = 1;
            queue.add(s);
            while(!queue.isEmpty()){

                int x = queue.poll();
                System.out.print(x);

                Iterator i = adj[x].iterator();
                while(i.hasNext()) {
                    Integer n = (Integer) i.next();
                    if(visited[n] != 1) {
                        visited[n] = 1;
                           queue.add(n);
                    }
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
    }
}
