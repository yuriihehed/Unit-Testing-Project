package com.gsd.algorithms.graphtheory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BreadthFirstSearchAdjacencyListIterativeFastQueueTest {

    // Helper method to add edges to the graph
    private void addDirectedEdge(Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph, int from, int to, int cost) {
        List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge> list = graph.get(from);
        if (list == null) {
            list = new ArrayList<>();
            graph.put(from, list);
        }
        list.add(new BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge(from, to, cost));
    }

    private Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> initializeGraph1() {
        Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph = new HashMap<>();
        addDirectedEdge(graph, 1, 2, 1);
        addDirectedEdge(graph, 1, 2, 1); // Double edge
        addDirectedEdge(graph, 1, 3, 1);
        addDirectedEdge(graph, 2, 4, 1);
        addDirectedEdge(graph, 2, 5, 1);
        addDirectedEdge(graph, 3, 6, 1);
        addDirectedEdge(graph, 3, 7, 1);
        addDirectedEdge(graph, 2, 2, 1); // Self loop
        addDirectedEdge(graph, 2, 3, 1);
        addDirectedEdge(graph, 6, 2, 1);
        addDirectedEdge(graph, 1, 6, 1);
        return graph;
    }

    private Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> initializeGraph2(int numNodes) {
        Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph = new HashMap<>();
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                addDirectedEdge(graph, i, j, 1);
            }
        }
        return graph;
    }

    @Test
    void testBFSStartingAtNode0() {
        Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph = initializeGraph1();
        int nodeCount = BreadthFirstSearchAdjacencyListIterativeFastQueue.bfs(graph, 0, 8);
        assertEquals(1, nodeCount, "BFS node count starting at node 0 should be 1");
    }

    @Test
    void testBFSStartingAtNode2() {
        Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph = initializeGraph1();
        int nodeCount = BreadthFirstSearchAdjacencyListIterativeFastQueue.bfs(graph, 2, 8);
        assertEquals(6, nodeCount, "BFS node count starting at node 2 should be 6");
    }

    @Test
    void testBFSWithCompleteGraph() {
        int numNodes = 100;
        Map<Integer, List<BreadthFirstSearchAdjacencyListIterativeFastQueue.Edge>> graph = initializeGraph2(numNodes);
        int nodeCount = BreadthFirstSearchAdjacencyListIterativeFastQueue.bfs(graph, 6, numNodes);
        assertEquals(100, nodeCount, "BFS node count starting at node 6 should be 100");
    }
}