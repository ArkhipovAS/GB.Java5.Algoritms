package com.arkhipov.hw7;

import java.awt.*;
import java.util.LinkedList;

public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public DepthFirstPaths (Graph g, int source){
        this.source = source;
        edgeTo = new int [g.vertexCount()];
        marked = new boolean[g.vertexCount()];
    }

    private void dfs (Graph g, int v){
        marked[v] = true;
        for (int w:
                g.adjList(v)) {
            if (!marked[w]){
                edgeTo[w] = v;
                dfs(g, w);
            }

        }
    }

    public boolean hasPathTo (int dist){
        return  marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist){
        if (!hasPathTo(dist)){
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();

        int vertex = dist;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
