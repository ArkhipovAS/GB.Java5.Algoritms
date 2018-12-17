package com.arkhipov.hw7;

import java.util.LinkedList;

public class BreadthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private int sourse;
    private static final int INF = Integer.MAX_VALUE;

    public BreadthFirstPath (Graph g, int sourse){
        marked = new boolean[g.vertexCount()];
        edgeTo = new int[g.vertexCount()];
        distTo = new int[g.vertexCount()];

        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = INF;
        }
    }

    private void bfs(Graph g, int sourse){
        LinkedList<Integer>queue = new LinkedList<>();
        queue.addLast(sourse);
        marked[sourse] = true;
        distTo[sourse] = 0;

        while (!queue.isEmpty()){
            int vertex = queue.removeFirst();
            for(int w:
            g.adjList(vertex)){
                if(!marked[w]){
                    marked[w] = true;
                    edgeTo[w] = vertex;

                }
            }
        }
    }


}
