// Floyd Warshall Solver

public class FloydWarshallSolver {

    private static final int INF = Integer.MAX_VALUE;

    public static int[][] floydWarshall(int[][] graph) {
        int n = graph.length;
        int[][] dist = new int[n][n];

        // Initialize distance array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0; // Distance to self is zero
                } else if (graph[i][j] != 0) {
                    dist[i][j] = graph[i][j]; // Use weight from graph
                } else {
                    dist[i][j] = INF; // No path exists
                }
            }
        }

        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] graph = {
                {0, 3, 0, 0, 0, 0},
                {2, 0, 0, 1, 0, 0},
                {0, 7, 0, 0, 2, 0},
                {6, 0, 0, 0, 0, 1},
                {0, 0, 0, 3, 0, 0},
                {0, 0, 0, 0, 1, 0}
        };

        int[][] result = floydWarshall(graph);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(result[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

