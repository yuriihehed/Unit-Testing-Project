package com.gsd.algorithms.graphtheory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchAdjacencyListRecursiveTest {

    // Helper method to add edges to the graph
    private void addDirectedEdge(Map<Integer, List<DepthFirstSearchAdjacencyListRecursive.Edge>> graph, int from, int to, int cost) {
        List<DepthFirstSearchAdjacencyListRecursive.Edge> list = graph.get(from);
        if (list == null) {
            list = new ArrayList<>();
            graph.put(from, list);
        }
        list.add(new DepthFirstSearchAdjacencyListRecursive.Edge(from, to, cost));
    }

    private Map<Integer, List<DepthFirstSearchAdjacencyListRecursive.Edge>> initializeGraph() {
        Map<Integer, List<DepthFirstSearchAdjacencyListRecursive.Edge>> graph = new HashMap<>();
        addDirectedEdge(graph, 0, 1, 4);
        addDirectedEdge(graph, 0, 2, 5);
        addDirectedEdge(graph, 1, 2, -2);
        addDirectedEdge(graph, 1, 3, 6);
        addDirectedEdge(graph, 2, 3, 1);
        addDirectedEdge(graph, 2, 2, 10); // Self loop
        return graph;
    }

    @Test
    void testDFSStartingAtNode0() {
        Map<Integer, List<DepthFirstSearchAdjacencyListRecursive.Edge>> graph = initializeGraph();
        long nodeCount = DepthFirstSearchAdjacencyListRecursive.dfs(0, new boolean[5], graph);
        assertEquals(4, nodeCount, "DFS node count starting at node 0 should be 4");
    }

    @Test
    void testDFSStartingAtNode4() {
        Map<Integer, List<DepthFirstSearchAdjacencyListRecursive.Edge>> graph = initializeGraph();
        long nodeCount = DepthFirstSearchAdjacencyListRecursive.dfs(4, new boolean[5], graph);
        assertEquals(1, nodeCount, "DFS node count starting at node 4 should be 1");
    }
}