package MethodandClasses.CollectionFramework.Algorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearchDemo {
    private int Vertices;

    // Adjacency Lists
    private LinkedList<Integer> adj[];

    BreadthFirstSearchDemo(int v)
    {
        Vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i){
            adj[i] = new LinkedList();
//            System.out.println(i + " " + adj[i]);
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int start) {

        boolean visited[] = new boolean[Vertices];

        // Create a queue for BFS
        LinkedList<Integer> queue
                = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);

        while (queue.size() != 0) {

            // Dequeue a vertex from queue and print it
            start = queue.poll();
            System.out.print(start + " ");

            Iterator<Integer> it = adj[start].listIterator();
            while (it.hasNext()){
                int n = it.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }
    }

    public static void main(String[] args) {
        BreadthFirstSearchDemo g = new BreadthFirstSearchDemo(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);

    }
}
