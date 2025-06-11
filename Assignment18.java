package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Assignment18 {


//    1st Program
//    public static List<Integer> bfsTraversal(int V, List<List<Integer>> adj) {
//        List<Integer> bfs = new ArrayList<>();
//        boolean[] visited = new boolean[V];
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(0);
//        visited[0] = true;
//
//        while (!queue.isEmpty()) {
//            int node = queue.poll();
//            bfs.add(node);
//
//            for (int neighbor : adj.get(node)) {
//                if (!visited[neighbor]) {
//                    queue.offer(neighbor);
//                    visited[neighbor] = true;
//                }
//            }
//        }
//
//        return bfs;
//    }
//
//    public static void main(String[] args) {
//        int V = 5;
//        List<List<Integer>> adj = new ArrayList<>();
//        adj.add(Arrays.asList(1, 2));       // 0
//        adj.add(Arrays.asList(0, 2, 3));    // 1
//        adj.add(Arrays.asList(0, 1, 4));    // 2
//        adj.add(Arrays.asList(1, 4));       // 3
//        adj.add(Arrays.asList(2, 3));       // 4
//
//        List<Integer> result = bfsTraversal(V, adj);
//        System.out.println("BFS Traversal: " + result);
//}




//    2nd Program
    public static List<Integer> dfsTraversal(int V, List<List<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];

        dfsHelper(0, adj, visited, dfs);

        return dfs;
    }

    private static void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, dfs);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));         // 0
        adj.add(Arrays.asList(0, 2));         // 1
        adj.add(Arrays.asList(0, 1, 3, 4));   // 2
        adj.add(Arrays.asList(2));            // 3
        adj.add(Arrays.asList(2));            // 4

        List<Integer> result = dfsTraversal(V, adj);
        System.out.println("DFS Traversal: " + result);
}



}
