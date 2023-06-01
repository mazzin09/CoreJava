package MethodandClasses.CollectionFramework.Algorithm;

import java.util.LinkedList;

public class DFSIteratorDemo {

    private int Vertices;

    // Adjacency Lists
    private LinkedList<Integer> adj[];

    DFSIteratorDemo(int v){
        Vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i){
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int start){
        boolean visited[] = new boolean[Vertices];
        // Create a stack for DFS
        LinkedList<Integer> stack
                = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[start] = true;
        stack.add(start);
    }


    public static void main(String[] args) {

    }
}
