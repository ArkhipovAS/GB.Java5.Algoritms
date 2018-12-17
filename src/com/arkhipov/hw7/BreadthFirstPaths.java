package com.arkhipov.hw7;

import java.util.LinkedList;

public class BreadthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private int sourсe;
    private static final int INF = Integer.MAX_VALUE;

    public BreadthFirstPaths (Graph g, int sourсe){
        marked = new boolean[g.vertexCount()];
        edgeTo = new int[g.vertexCount()];
        distTo = new int[g.vertexCount()];

        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = INF;
        }
        bfs(g, 0);
    }

    private void bfs(Graph g, int sourсe){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(sourсe);
        marked[sourсe] = true;
        distTo[sourсe] = 0;

        while (!queue.isEmpty()){
            int vertex = queue.removeFirst();
            for(int w:
            g.adjList(vertex)){
                if(!marked[w]){
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    distTo[w] = distTo[vertex]+1;
                    queue.addLast(w);
                }
            }
        }
    }

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList <Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();

        int vertex = dist;
        while (vertex != sourсe) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

    public int distTo(int dist) {
        return distTo[dist];
    }


}
