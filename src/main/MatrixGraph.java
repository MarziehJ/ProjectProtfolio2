package main;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MatrixGraph {

    protected int[][] matrixGraph;
    protected int[][] matrixWeightGraph;

    MatrixGraph(int vertices) {
        matrixGraph = new int[vertices][vertices];
        matrixWeightGraph = new int[vertices][vertices];
    }

    public void addEdge(int from, int to, int weight) {
        matrixGraph[from][to] = 1;
        matrixWeightGraph[from][to] = weight;
    }


    public void printGraph() {
        for (int fromi = 0; fromi < matrixGraph.length; fromi++) {
            System.out.println("Edges from vertex: " + fromi);
            for (int toj = 0; toj < matrixGraph.length; toj++) {
                if (matrixGraph[fromi][toj] == 1) {
                    System.out.print("To" + toj);
                    System.out.print(" weight " + matrixWeightGraph[fromi][toj]);
                }

            }
            System.out.println(" ");
        }
    }

    public void PrimsMST() {
        int[] distance = new int[matrixGraph.length];
        int[] predecessor = new int[matrixGraph.length];
        int[] visited = new int[matrixGraph.length];
        PriorityQueue<Pair> Q = new PriorityQueue<Pair>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);
        if (matrixGraph.length > 0) {
            distance[0] = 0;
            Q.offer(new Pair(0, 0));
        }
        int counter = 0;
        int MST = 0;
        while (!Q.isEmpty() && counter < matrixGraph.length) {
            Pair u = Q.poll();
            if (visited[u.index] != 1) {
                for (int v = 0; v < matrixGraph.length; v++) {
                    if (matrixGraph[u.index][v] == 1 && matrixWeightGraph[u.index][v] < distance[v]) {
                        distance[v] = matrixWeightGraph[u.index][v];
                        predecessor[v] = u.index;
                        Q.offer(new Pair(distance[v], v));
                    }
                }
                visited[u.index] = 1;
                counter++;
                MST += distance[u.index];
            }
        }
        printMSTValue(MST);
        printMSTEdges(predecessor, distance);

    }

    public void printMSTValue(int MST) {
        System.out.println(" Minimum spanning Tree Distance: " + MST);
    }

    public void printMSTEdges(int[] pred, int[] dist) {
        for (int i = 0; i < matrixGraph.length; i++) {
            System.out.println(i + " parent " + pred[i] + " EdgeWeight: " + dist[i]);
        }
    }
}
