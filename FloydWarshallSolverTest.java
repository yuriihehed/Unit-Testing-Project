package com.gsd.algorithms.graphtheory.FloydWarshallSolver.FloydWarshallSolver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Dean - FloydWarshallSolver Tests")
class FloydWarshallSolverTest {

    FloydWarshallSolver floydWarshallSolver;

    @BeforeEach
    void setUp() {
        double[][] graph = {
                {0, 3, Double.POSITIVE_INFINITY, 7},
                {8, 0, 2, Double.POSITIVE_INFINITY},
                {5, Double.POSITIVE_INFINITY, 0, 1},
                {2, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0}
        };
        floydWarshallSolver = new FloydWarshallSolver(graph);
    }

    @Test
    @DisplayName("FloydWarshallSolver should correctly initialize the solver with the graph")
    void testFloydWarshallSolverInitialization() {
        assertNotNull(floydWarshallSolver, "FloydWarshallSolver should be initialized");
        double[][] distMatrix = floydWarshallSolver.getDistanceMatrix();
        assertEquals(0, distMatrix[0][0], "Distance from node 0 to itself should be 0");
        assertEquals(3, distMatrix[0][1], "Distance from node 0 to 1 should be 3");
    }

    @Test
    @DisplayName("FloydWarshallSolver should compute the shortest paths correctly")
    void testFloydWarshallSolverShortestPaths() {
        floydWarshallSolver.solve();
        double[][] distMatrix = floydWarshallSolver.getDistanceMatrix();
        assertEquals(4, distMatrix[0][2], "Shortest path from node 0 to 2 should be 4");
        assertEquals(7, distMatrix[1][3], "Shortest path from node 1 to 3 should be 7");
    }
}
