package MethodandClasses.CollectionFramework.Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class DepthFirstSearchDemo {
    private int Vertices;

    // Adjacency Lists
    private ArrayList<ArrayList<Integer>> graph;

    DepthFirstSearchDemo(int node){
        Vertices = node;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < node; ++i){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int w) {

        graph.get(v).add(w);
        graph.get(w).add(v);
    }

    void dfsMain(int node, boolean visited[]){
        visited[node] = true;
        System.out.print(node + " ");
        for(int i: graph.get(node)){
            if(visited[i] == false){
                dfsMain(i, visited);
            }
        }
    }

    void DFS(int start){
        boolean visited[] = new boolean[Vertices];
        System.out.println("DFS Traversal");
        dfsMain(start, visited);
    }



    public static void main(String[] args) {
        DepthFirstSearchDemo dfs = new DepthFirstSearchDemo(8);
        dfs.addEdge(0,1);
        dfs.addEdge(0,3);
        dfs.addEdge(0,2);
        dfs.addEdge(1,4);
        dfs.addEdge(3,4);
        dfs.addEdge(3,5);
        dfs.addEdge(5,6);
        dfs.addEdge(5,7);
        dfs.DFS(0);
    }
}
