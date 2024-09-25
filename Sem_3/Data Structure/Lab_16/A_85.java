import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Graph{
    private Map<Integer, List<Integer>> adjList;
    public Graph(){
        adjList = new HashMap<>();
    }
    public void addEdge(int u,int v){
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        // adjList.get(v).add(u);  //for Undirected Graph
    }
    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start,visited);
        System.out.println();
    }
    private void dfsHelper(int vertex,Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex+" ");
        for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour, visited);
            }
        }
    }
    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex+" ");
            for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}
public class A_85 {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 6);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        g.addEdge(7, 8);

        

        g.dfs(1);
        g.bfs(1);
    }
}