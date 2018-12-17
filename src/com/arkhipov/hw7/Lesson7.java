package com.arkhipov.hw7;

public class Lesson7 {
    public static void main(String[] args) {
        Graph g = new Graph(13);
        g.addEdge(0,6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.addEdge(5,0);
        g.addEdge(4,6);
        g.addEdge(4,3);

        g.addEdge(7,8);

        g.addEdge(9,10);
        g.addEdge(9,12);
        g.addEdge(9,11);
        g.addEdge(11,12);


        DepthFirstPaths dfs = new DepthFirstPaths(g, 0);
        System.out.println(dfs.hasPathTo(5));
        System.out.println(dfs.hasPathTo(12));
        System.out.println(dfs.pathTo(5));


    }
}
