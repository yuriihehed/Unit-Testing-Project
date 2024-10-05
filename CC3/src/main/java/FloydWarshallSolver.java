package com.example;

import java.util.Arrays;

public class FloydWarshallSolver {
    private final int INF = Integer.MAX_VALUE; // Infinity value for unreachable paths
    private int[][] distance; // Distance matrix
    private int numVertices; // Number of vertices in the graph

    // Constructor
    public FloydWarshallSolver(int numVertices) {
        this.numVertices = numVertices;
        distance = new int[numVertices][numVertices];

        // Initialize distance matrix
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i == j) {
                    distance[i][j] = 0; // Distance to self is 0
                } else {
                    distance[i][j] = INF; // Initialize other distances to infinity
                }
            }
        }
    }

    // Method to add edges with weights
    public void addEdge(int u, int v, int weight) {
        distance[u][v] = weight; // Set the weight for the directed edge from u to v
    }

    // Method to compute shortest paths using Floyd-Warshall algorithm
    public void computeShortestPaths() {
        for (int k = 0; k < numVertices; k++) {
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    if (distance[i][k] != INF && distance[k][j] != INF) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                    }
                }
            }
        }
    }

    // Method to display the distance matrix
    public void displayShortestPaths() {
        for (int[] row : distance) {
            for (int d : row) {
                if (d == INF) {
                    System.out.print("INF "); // Print INF for unreachable paths
                } else {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        FloydWarshallSolver fws = new FloydWarshallSolver(4);

        // Adding edges with weights (example)
        fws.addEdge(0, 1, 3);
        fws.addEdge(0, 2, 5);
        fws.addEdge(1, 2, 1);
        fws.addEdge(2, 3, 2);
        fws.addEdge(1, 3, 7);

        // Compute shortest paths
        fws.computeShortestPaths();

        // Display the shortest paths
        System.out.println("Shortest path matrix:");
        fws.displayShortestPaths();
    }
}
