package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(12);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(1, 2);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(10, 11);
        graph.addEdge(9, 10);
        graph.addEdge(8, 7);
        graph.depthFirstSearch(6);
        System.out.println("----------------");
        graph.breadthFirstSearch(6);

        /*
        graph.showMatrix();
        System.out.println(graph.vertexDegree(1));
        System.out.println(graph.maxDegreeVertex());
        int n[] = graph.getNeighbors(1);
        for (int i = 0; i < n.length; i++ ) {
            System.out.print(n[i] + " ");
        }
        System.out.println("--");
        graph.printGraphFormat();
        */
    }
}